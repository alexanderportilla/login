package com.example.demo.models.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.models.entity.Usuario;


public interface  UsuarioRepository extends JpaRepository<Usuario,Long>{
	 
	Usuario findByUsername(String user);
}