package com.cidadera.trabalhofinal.application.useCases;

import com.cidadera.trabalhofinal.application.models.OpenIssueRequest;
import com.cidadera.trabalhofinal.application.services.IssueServiceImpl;
import com.cidadera.trabalhofinal.business.entities.Issue;
import org.springframework.stereotype.Component;

@Component
public class OpenIssueUC {

    private final IssueServiceImpl service;

    public OpenIssueUC(IssueServiceImpl service) {
        this.service = service;
    }

    public long run(OpenIssueRequest request){
        Issue issue = service.toEntity().apply(request);
        return service.openIssue(issue).getId();

    }
}
