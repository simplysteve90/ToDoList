package it.dst.reposirtory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.dst.model.Compito;

@Repository
public interface CompitoRepository extends JpaRepository<Compito, Long>{
	public Compito findByNome(String nome);

}
