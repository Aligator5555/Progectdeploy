package ru.deploymysqlprogect.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.deploymysqlprogect.entinty.User;
import ru.deploymysqlprogect.repository.UserRepository;

@Service
@AllArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public String save(String username, Long phoneNumber) {
        User user = new User();
        user.setUsername(username);
        user.setPhoneNumber(phoneNumber);
        userRepository.save(user);
        return "home" ;
    }



}
