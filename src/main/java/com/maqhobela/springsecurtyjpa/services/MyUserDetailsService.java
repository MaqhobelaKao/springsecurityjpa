package com.maqhobela.springsecurtyjpa.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.maqhobela.springsecurtyjpa.models.MyUserDetails;
import com.maqhobela.springsecurtyjpa.models.User;
import com.maqhobela.springsecurtyjpa.repositores.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByUserName(username);
		user.orElseThrow(()-> new UsernameNotFoundException("Not found " + username));
		return user.map(MyUserDetails::new).get();
	}

}
