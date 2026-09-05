 package com.enminencia.gestionarusuarios.controller; 

import org.springframework.http.ReposeEmtity;
import org.springframework.web.bind.annotatio.postMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enminencia.gestionusarios.dto.UserRequestDTO;
import com.enminencia.gestionarusuarios.dto.UserResposeDTO;

@RestController
@RequestMapping("/users")
public class UserController {

    @postMapping
    public ResponseEntity<UserResponseDTO> createUser(UserRequestDTO
request) {

    }
}