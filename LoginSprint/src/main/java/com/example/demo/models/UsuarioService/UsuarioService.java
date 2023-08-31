package com.example.demo.models.UsuarioService;

import com.example.demo.models.entity.Usuario;

public interface  UsuarioService {
	
	public Usuario save (Usuario u);
	public String login(String user, String ctr);
}
