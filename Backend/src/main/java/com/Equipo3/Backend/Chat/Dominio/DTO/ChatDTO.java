package com.Equipo3.Backend.Chat.Dominio.DTO;

import com.Equipo3.Backend.Usuario.Dominio.DTO.UsuarioDTO;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase ChatDTO
 */
@NoArgsConstructor
@Getter
@Setter
@With
@EqualsAndHashCode
@AllArgsConstructor
public class ChatDTO {
    /**
     * id tipo int
     */
    private int id;

    /**
     * nombre tipo String
     */
    private String nombre;

//    /**
//     * usuarios tipo List<UsuarioVO>
//     */
//    private List<UsuarioDTO> usuarios = new ArrayList<>();

    /**
     * puerto tipo int
     */
    private int puerto;

//    /**
//     * historial tipo Mensaje
//     */
//    private Mensaje historial;


    public ChatDTO(String nombre, int puerto) {
        this.nombre = nombre;
        this.puerto = puerto;
    }
}
