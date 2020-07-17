package it.dst.model;

import java.util.Collection;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

@Entity
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "utente_id")
	private Long id;
	private String username;
	private String password;
	private String email;
	@Lob
	private byte[] immagine;
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "utenti_ruoli",joinColumns = @JoinColumn(name = "utente_id"),inverseJoinColumns = @JoinColumn(name = "ruolo_id"))
    private Collection<Ruolo> roles;
	@ManyToMany(cascade = CascadeType.ALL)
	 @JoinTable(name = "utenti_compiti",joinColumns = @JoinColumn(name = "utente_id"),inverseJoinColumns = @JoinColumn(name = "compito_id"))
	private List<Compito> listaCompiti;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public byte[] getImmagine() {
		return immagine;
	}
	public void setImmagine(byte[] immagine) {
		this.immagine = immagine;
	}
	public List<Compito> getListaCompiti() {
		return listaCompiti;
	}
	public void setListaCompiti(List<Compito> listaCompiti) {
		this.listaCompiti = listaCompiti;
	}
	public Collection<Ruolo> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Ruolo> roles) {
		this.roles = roles;
	}
	
}
