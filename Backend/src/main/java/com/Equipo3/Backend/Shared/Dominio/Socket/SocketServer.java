package com.Equipo3.Backend.Shared.Dominio.Socket;

import com.Equipo3.Backend.Shared.Aplicacion.Dto;
import org.springframework.stereotype.Component;

public interface SocketServer {
    void Send(Dto object);
}