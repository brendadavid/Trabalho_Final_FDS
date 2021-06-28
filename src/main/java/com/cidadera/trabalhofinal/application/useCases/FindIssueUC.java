package com.cidadera.trabalhofinal.application.useCases;

import com.cidadera.trabalhofinal.application.models.IssueResponse;
import com.cidadera.trabalhofinal.application.services.IssueServiceImpl;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindIssueUC {

    private final IssueServiceImpl service;

    public FindIssueUC(IssueServiceImpl service) {
        this.service = service;
    }

    public Optional<IssueResponse> byId(long id){

        return service.findById(id).map(issue -> service.fromEntity().apply(issue));
    }
}
