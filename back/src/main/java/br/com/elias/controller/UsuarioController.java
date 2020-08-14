package br.com.elias.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.elias.model.dto.UsuarioCadDto;
import br.com.elias.service.IUsuarioService;


@RestController
@CrossOrigin
public class UsuarioController {
	
	@Autowired
	private IUsuarioService iUsuarioService;
	
	@RequestMapping(value = "/usuario/registro", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody UsuarioCadDto user) throws Exception {
		return ResponseEntity.ok(iUsuarioService.save(user));
	}

}
