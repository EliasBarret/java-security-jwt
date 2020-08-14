package br.com.elias.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.elias.model.Usuario;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario,Integer>{
	Usuario findByNome(String nome);
}
