package com.raigakki.webappshowcase.service;

import com.raigakki.webappshowcase.entity.model.CustomUserDetails;
import com.raigakki.webappshowcase.entity.model.User;
import com.raigakki.webappshowcase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO IMPLEMENTARE ATTEMPTS
        Optional<User> user = userRepository.findByUsername(username);
        if(user.isEmpty()) {
            throw new UsernameNotFoundException("User Not Found");
        }
        return new CustomUserDetails(user.get());
    }

    public void saveUser(String username, String password, String role) {
        // TODO IMPLEMENTARE CHECK ESISTENZA USERNAME
        User user = new User();
        user.setUsername(username);
        user.setPassword(new BCryptPasswordEncoder().encode(password));
        user.setRole(role);
        userRepository.save(user);
    }

}
