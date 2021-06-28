package com.cidadera.trabalhofinal.business.repositorios;

import com.cidadera.trabalhofinal.business.entities.Issue;

import java.util.Optional;

public interface IssueRepository {
    Issue save(Issue issue);

    Optional <Issue> findById(long id);
}
