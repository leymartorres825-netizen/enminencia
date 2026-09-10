package com.enminencia.gestionarusuarios.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enminencia.gestionarusuarios.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

    Optional<Users> findFirstByUsername(String username);
}
