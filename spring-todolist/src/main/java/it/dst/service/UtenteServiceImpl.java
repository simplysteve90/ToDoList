package it.dst.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import it.dst.reposirtory.UtenteRepository;

public class UtenteServiceImpl  implements UtenteService{
@Autowired
UtenteRepository utenteRepos;
@Autowired
private BCryptPasswordEncoder passEncoder;
@Override
public void deleteById(Long userId) {
	// TODO Auto-generated method stub
	
}

@Override
public UserDetails 
}
