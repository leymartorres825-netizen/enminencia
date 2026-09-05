package com.enminencia.gestionarusuarios.dto;

import lombok.data;

@Data 
public class UserResponseDTO {
    /**
     * id del usuario
     */
    private long id;

    /**
     * Nombre del usuario
     */
    private String username;

    /**
     * Edad del usuario
     */
    private long age;

    /**
     * Email del usuario
     */
    private String email;
    
}