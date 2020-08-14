package br.com.elias.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.elias.model.Usuario;
import br.com.elias.model.dto.UsuarioCadDto;
import br.com.elias.repository.IUsuarioRepository;
import br.com.elias.service.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	private IUsuarioRepository iUsuarioRepository;
	
	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Override
	public Usuario save(UsuarioCadDto UsuarioCadDto) {
			
		Usuario novoUsuario = new Usuario();
		novoUsuario.setNome(UsuarioCadDto.getNome());
		novoUsuario.setEmail(UsuarioCadDto.getEmail());
		novoUsuario.setPassword(bcryptEncoder.encode(UsuarioCadDto.getSenha()));
		novoUsuario.setDataCriacao(new Date());
		novoUsuario.setDataAtualizacao(new Date());
			
		return iUsuarioRepository.save(novoUsuario);
	}

}
