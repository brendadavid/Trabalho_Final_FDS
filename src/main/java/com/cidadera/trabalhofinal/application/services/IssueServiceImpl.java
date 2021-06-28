package com.cidadera.trabalhofinal.application.services;

import com.cidadera.trabalhofinal.application.models.IssueResponse;
import com.cidadera.trabalhofinal.application.models.OpenIssueRequest;
import com.cidadera.trabalhofinal.business.entities.Issue;
import com.cidadera.trabalhofinal.business.repositorios.IssueRepository;
import com.cidadera.trabalhofinal.business.services.IssueService;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class IssueServiceImpl extends IssueService {
    public IssueServiceImpl(IssueRepository repository) {
        super(repository);
    }

    @Override
    public Function<OpenIssueRequest, Issue> toEntity() {
        return request -> {
            Issue issue = new Issue();
            issue.setTitle(request.getTitle());
            issue.setDescription(request.getDescription());
            issue.setDate(request.getDate());
            issue.setNeighborhood(request.getNeighborhood());
            issue.setStreet(request.getStreet());
            issue.setCategory(request.getCategory());
            issue.setImageLink(request.getImageLink());

            return issue;
        };
    }

    @Override
    public Function<Issue, IssueResponse> fromEntity() {
        return issue -> {
            IssueResponse response = new IssueResponse();
            response.setId(issue.getId());
            response.setTitle(issue.getTitle());
            response.setDescription(issue.getDescription());
            response.setDate(issue.getDate());
            response.setNeighborhood(issue.getNeighborhood());
            response.setStreet(issue.getStreet());
            response.setCategory(issue.getCategory());
            response.setImageLink(issue.getImageLink());

            return response;
        };
    }
}
