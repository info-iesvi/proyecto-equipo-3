package GamerHUB.GestionUsuarios.model.dto;

import GamerHUB.GestionEventos.model.dto.EventoDTO;
import GamerHUB.GestionUsuarios.model.vo.UsuarioVO;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 */
public class UsuarioDTO {

        private IntegerProperty id;
        private StringProperty nombre;
        private StringProperty password;
        private StringProperty email;
        private ObjectProperty<LocalDate> fecha_nacimiento;
        private IntegerProperty telefono;
        private StringProperty rol;
        private ObservableList<IntegerProperty> amigos;
        private ObservableList<EventoDTO> eventos;

        public UsuarioDTO() {
        }

        public UsuarioDTO(IntegerProperty id, StringProperty nombre, StringProperty password, StringProperty email, ObjectProperty<LocalDate> fecha_nacimiento, IntegerProperty telefono, StringProperty rol, ObservableList<IntegerProperty> amigos, ObservableList<EventoDTO> eventos ) {
                this.id = new SimpleIntegerProperty((int) Math.abs(System.currentTimeMillis()/10000));;
                this.nombre = nombre;
                this.password = password;
                this.email = email;
                this.fecha_nacimiento = fecha_nacimiento;
                this.telefono = telefono;
                this.rol = rol;
                this.amigos = amigos;
                this.eventos = eventos;
        }

        public UsuarioDTO(int id, String nombre, String password, String email, LocalDate fecha_nacimiento, int telefono, String rol, ArrayList<IntegerProperty> amigos, ArrayList<EventoDTO> eventos) {
                this.id = new SimpleIntegerProperty((int) Math.abs(System.currentTimeMillis()/10000));
                this.nombre =new SimpleStringProperty(nombre);
                this.password = new SimpleStringProperty(password);
                this.email =new SimpleStringProperty(email) ;
                this.fecha_nacimiento =new SimpleObjectProperty<LocalDate>(fecha_nacimiento) ;
                this.telefono =new SimpleIntegerProperty(telefono);
                this.rol =new SimpleStringProperty(rol) ;
                this.amigos = FXCollections.observableArrayList(amigos);
                this.eventos = FXCollections.observableArrayList(eventos);
        }

        public int getId() {
                return id.get();
        }

        public IntegerProperty idProperty() {
                return id;
        }

        public void setId(int id) {
                this.id.set(id);
        }

        public String getNombre() {
                return nombre.get();
        }

        public StringProperty nombreProperty() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre.set(nombre);
        }

        public String getPassword() {
                return password.get();
        }

        public StringProperty passwordProperty() {
                return password;
        }

        public void setPassword(String password) {
                this.password.set(password);
        }

        public String getEmail() {
                return email.get();
        }

        public StringProperty emailProperty() {
                return email;
        }

        public void setEmail(String email) {
                this.email.set(email);
        }

        public LocalDate getFecha_nacimiento() {
                return fecha_nacimiento.get();
        }

        public ObjectProperty<LocalDate> fecha_nacimientoProperty() {
                return fecha_nacimiento;
        }

        public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
                this.fecha_nacimiento.set(fecha_nacimiento);
        }

        public int getTelefono() {
                return telefono.get();
        }

        public IntegerProperty telefonoProperty() {
                return telefono;
        }

        public void setTelefono(int telefono) {
                this.telefono.set(telefono);
        }

        public String getRol() {
                return rol.get();
        }

        public StringProperty rolProperty() {
                return rol;
        }

        public void setRol(String rol) {
                this.rol.set(rol);
        }

        public ObservableList<IntegerProperty> getAmigos() {
                return amigos;
        }

        public void setAmigos(ObservableList<IntegerProperty> amigos) {
                this.amigos = amigos;
        }



        @Override
        public String toString() {
                return "UsuarioDTO{" +
                        "id=" + id +
                        ", nombre=" + nombre +
                        ", password=" + password +
                        ", email=" + email +
                        ", fecha_nacimiento=" + fecha_nacimiento +
                        ", telefono=" + telefono +
                        ", rol=" + rol +
                        ", amigos=" + amigos +
                        '}';
        }
}
