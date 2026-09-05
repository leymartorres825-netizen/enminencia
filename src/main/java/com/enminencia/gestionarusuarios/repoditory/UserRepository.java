package com.eminencia.gestionusuarios.repository;

import java.util.Optional;

import org.springfrawework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enminencia.gestionusuarios.entity.Users;

@repository
public interface UserRepository extends JpaRepository<Users, Long>{
    Optional<Users> findFirstByUsername(String username);
}