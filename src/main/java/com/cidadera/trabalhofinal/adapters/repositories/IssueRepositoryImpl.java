package com.cidadera.trabalhofinal.adapters.repositories;

import com.cidadera.trabalhofinal.business.entities.Issue;
import com.cidadera.trabalhofinal.business.repositorios.IssueRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueRepositoryImpl extends CrudRepository<Issue,Long>, IssueRepository {

}
