package com.cidadera.trabalhofinal.application.services;

import com.cidadera.trabalhofinal.business.repositorios.IssueRepository;
import com.cidadera.trabalhofinal.business.services.IssueService;
import org.springframework.stereotype.Service;


@Service
public class IssueServiceImpl extends IssueService {
    public IssueServiceImpl(IssueRepository repository) {
        super(repository);
    }

}
