package com.example.authentificationservice.secure.repositories;

import com.example.authentificationservice.secure.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
      AppUser findByUsername(String username);
}
