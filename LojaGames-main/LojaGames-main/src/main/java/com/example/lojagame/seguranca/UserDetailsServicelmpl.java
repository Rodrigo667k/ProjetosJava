package com.example.lojagame.seguranca;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.lojagame.Repository.UsuarioRepository;
import com.example.lojagame.model.Usuario;

@Service
public class UserDetailsServicelmpl implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository userRepository;
	
	@Override
	public UserDetailslml loadUserByUsername(String userName) throws UsernameNotFoundException{
		Optional<Usuario>usuario = userRepository.findByUsuario(userName);
		usuario.orElseThrow(() -> new UsernameNotFoundException(userName + "not found."));
		
		return usuario.map(UserDetailslml::new).get();
		
	}
	

}
