package com.cidadera.trabalhofinal.business.services;

import com.cidadera.trabalhofinal.business.entities.Issue;
import com.cidadera.trabalhofinal.business.repositorios.IssueRepository;

import java.util.Optional;
import java.util.function.Function;

public abstract class IssueService {
    protected IssueRepository repository;

    public IssueService(IssueRepository repository) {
        this.repository = repository;
    }
    public abstract Function<?,Issue> toEntity();
    public abstract Function<Issue, ?> fromEntity();

    public Issue openIssue(Issue issue){
      return repository.save(issue);
    }

    public Optional<Issue> findById(long id){
        return repository.findById(id);
    }
}
