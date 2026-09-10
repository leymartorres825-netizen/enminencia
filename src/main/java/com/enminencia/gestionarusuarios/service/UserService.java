package com.enminencia.gestionarusuarios.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.enminencia.gestionarusuarios.dto.UserRequestDTO;
import com.enminencia.gestionarusuarios.dto.UserResponseDTO;
import com.enminencia.gestionarusuarios.entity.Users;
import com.enminencia.gestionarusuarios.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponseDTO createUser(UserRequestDTO request) {
        Optional<Users> userFound = userRepository.findFirstByUsername(request.getUsername());
        if (userFound.isPresent()) {
            throw new IllegalArgumentException("El nombre de usuario ya existe");
        }

        Users user = new Users();
        user.setUsername(request.getUsername());
        user.setAge(request.getAge());
        user.setEmail(request.getEmail());
        return toResponse(userRepository.save(user));
    }

    public List<UserResponseDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    public UserResponseDTO getUserById(Long id) {
        return userRepository.findById(id)
                .map(this::toResponse)
                .orElseThrow(() -> new IllegalArgumentException("Usuario no encontrado"));
    }

    private UserResponseDTO toResponse(Users user) {
        UserResponseDTO response = new UserResponseDTO();
        response.setId(user.getId());
        response.setUsername(user.getUsername());
        response.setAge(user.getAge());
        response.setEmail(user.getEmail());
        return response;
    }
}
