package com.example.lojagame.seguranca;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.lojagame.model.Usuario;

public class UserDetailslml implements UserDetails{

	private static final long serialVersionUID = 1L;
	
		private String userName;
		private String possword;
		private List<GrantedAuthority> authorities;
		
	public UserDetailslml (Usuario usuario) {
		this.userName = usuario.getUsuario();
		this.possword = usuario.getUsuario();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return authorities;
	}
	public UserDetailslml(){}

	@Override
	public String getPassword() {
		return possword;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
		
		

}