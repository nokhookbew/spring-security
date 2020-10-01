package se.bewvy.springsecurity.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import se.bewvy.springsecurity.model.User;
import se.bewvy.springsecurity.repositories.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
