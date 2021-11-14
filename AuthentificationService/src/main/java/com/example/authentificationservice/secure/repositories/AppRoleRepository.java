package com.example.authentificationservice.secure.repositories;

import com.example.authentificationservice.secure.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
      AppRole findByRoleName(String rolename);
}
