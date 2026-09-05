package comeminencia.gestionarusuarios.dto;

import lombok.Data;

@Data
public class UserResponseDTO {
   /**
     * id del usuario
    */ 
   public Long id;

   /**
     * Nombre del usuario
     */
    public String username;

    /**
     * Edad del usuario
     */
    Long age;

     /**
     * Email del usuario
     */
    private String email;

}