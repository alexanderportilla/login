package com.example.demo.models.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.entity.Usuario;
import com.example.demo.models.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Usuario save(Usuario u) {
		
		return usuarioRepository.save(u);
	}

	@Override
	public String login(String user, String ctr) {
		
		Usuario usuario = usuarioRepository.findByUsername(user);
		if (usuario == null) {
			return "Usuario no encontrado";
		}
		if (!usuario.getPassword().equals(ctr)) {
			return "Contraseña Incorrecta";
		}
		return "Inicio de sesion exitoso";
	}
	
}
