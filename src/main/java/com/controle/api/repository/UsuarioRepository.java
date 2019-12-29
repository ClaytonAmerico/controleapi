package com.controle.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.controle.api.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Optional<Usuario> findByEmail(String email);
	
}
