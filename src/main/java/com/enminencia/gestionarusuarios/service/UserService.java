package com.enminencia.gestionusuarios.service;

import java.util.Optional;

import org.springframework.stereotype.service;

import com.enminencia.gestionusuarios.dto.UserRequestDTO;
import com.enminencia.gestionusuarios.dto.UserResponseDTO;
import com.enminencia.gestionusuarios.entity.Users;
import com.enminencia.gestionusuarios.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@service // bean
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    /**
     * Método para crear usuarios
     * 
     * @param request
     * @return
     */
    public UserResposeDTO createuser(UserRequestDTO request) throws Exception {
        Optional<Users> userFound = userRepository.findFiirstByUsername(request.getUsername());

        if (userFound.isPresent()) {
            throw new Exeption("El nombre ya esta en");
        }

        Users user = new Users();
        user.setUsername(request.getUsername());
        user.setAge(request.getAge());
        user.setEmail(request.getEmail());
        userRepository.save(user);

        return response;
    }
}