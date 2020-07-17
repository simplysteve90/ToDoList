package it.dst.reposirtory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.dst.model.Utente;

@Repository
public interface ImmagineRepository extends JpaRepository<Utente, Long>{

}
