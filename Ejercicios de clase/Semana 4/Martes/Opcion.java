package com.ejercicio.martes;

import java.util.Optional;

class Usuario {
    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
class UsuarioService {
    // Método que retorna un Optional<Usuario> (puede o no devolver un usuario)
    public Optional<Usuario> buscarUsuario(String nombre) {
        if ("Juan".equalsIgnoreCase(nombre)) {
            return Optional.of(new Usuario("Juan"));
        }
        return Optional.empty(); // No se encontró el usuario
    }
}

public class Opcion{
	public static void main(String[] args) {
        UsuarioService servicio = new UsuarioService();

        // Buscar usuario que existe
        Optional<Usuario> usuarioEncontrado = servicio.buscarUsuario("Juan");
        usuarioEncontrado.ifPresent(u -> System.out.println("Usuario encontrado: " + u.getNombre()));

        // Buscar usuario que no existe
        Optional<Usuario> usuarioNoEncontrado = servicio.buscarUsuario("Pedro");
        Usuario usuarioPorDefecto = usuarioNoEncontrado.orElse(new Usuario("Invitado"));
        System.out.println("Usuario mostrado: " + usuarioPorDefecto.getNombre());
    }
}
	


