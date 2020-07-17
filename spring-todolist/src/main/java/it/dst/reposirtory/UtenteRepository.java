package it.dst.reposirtory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.dst.model.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long>{
	public Utente findByEmail(String email);

}
