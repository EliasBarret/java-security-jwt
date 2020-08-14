package br.com.elias.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.elias.model.Usuario;
import br.com.elias.repository.IUsuarioRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService{

	@Autowired
	private IUsuarioRepository iUsuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String nome) throws UsernameNotFoundException {
		Usuario usuario = iUsuarioRepository.findByNome(nome);
		if(usuario == null){
			throw new UsernameNotFoundException("Não existe usuario com este nome: "+ nome); 
		}
		return new org.springframework.security.core.userdetails.User(usuario.getNome(), usuario.getPassword(),
				new ArrayList<>());
	}	
}
