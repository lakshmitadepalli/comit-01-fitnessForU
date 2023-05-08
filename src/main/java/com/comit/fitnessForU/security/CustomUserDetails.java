package com.comit.fitnessForU.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.comit.fitnessForU.bean.UserBean;

public class CustomUserDetails implements UserDetails {

	private static final long serialVersionUID = 1L;
UserBean user;

   public CustomUserDetails(UserBean user) {
	super();
	this.user = user;
}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return null;
	}

	@Override
	public String getPassword() {
		
		return this.user.getPassword();
	}

	@Override
	public String getUsername() {
		
		return this.user.getUsername();
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
		
		return "A".equalsIgnoreCase(this.user.getStatus());
	}

}
