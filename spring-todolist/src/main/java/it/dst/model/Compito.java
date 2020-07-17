package it.dst.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Compito {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String tipo;
	private String nome;
	private String descrizione;
	private String data;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime deadline;
@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
private Utente utente;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getDescrizione() {
	return descrizione;
}
public void setDescrizione(String descrizione) {
	this.descrizione = descrizione;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public LocalDateTime getDeadline() {
	return deadline;
}
public void setDeadline(LocalDateTime deadline) {
	this.deadline = deadline;
}
public Utente getUtente() {
	return utente;
}
public void setUtente(Utente utente) {
	this.utente = utente;
}

}
