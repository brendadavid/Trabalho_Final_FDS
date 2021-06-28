package com.cidadera.trabalhofinal.adapters.controllers;

import com.cidadera.trabalhofinal.application.models.IssueResponse;
import com.cidadera.trabalhofinal.application.models.OpenIssueRequest;
import com.cidadera.trabalhofinal.application.useCases.FindIssueUC;
import com.cidadera.trabalhofinal.application.useCases.OpenIssueUC;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/issues")
public class IssueController {
    private final OpenIssueUC openIssueUC;
    private final FindIssueUC findIssueUC;

    public IssueController(OpenIssueUC openIssueUC, FindIssueUC findIssueUC) {
        this.openIssueUC = openIssueUC;
        this.findIssueUC = findIssueUC;
    }

    @PostMapping
    public ResponseEntity<Long> openIssue(@RequestBody OpenIssueRequest request) {
        return new ResponseEntity<>(openIssueUC.run(request), HttpStatus.CREATED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<IssueResponse> findIssueById(@PathVariable long userId) {
       return findIssueUC.byId(userId)
               .map(ResponseEntity::ok)
               .orElse(ResponseEntity.notFound().build());
    }
}
