package br.com.elias.service;

import br.com.elias.model.Usuario;
import br.com.elias.model.dto.UsuarioCadDto;

public interface IUsuarioService {
	
	Usuario save(UsuarioCadDto UsuarioCadDto);
}
