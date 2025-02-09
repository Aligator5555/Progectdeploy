package ru.deploymysqlprogect.controller;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.deploymysqlprogect.repository.UserRepository;
import ru.deploymysqlprogect.service.UserService;

@Controller
@AllArgsConstructor
public class UserController {

    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String main(Model model) {
        return "main";

    }


    @GetMapping("/list-user")
    public String listUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "list-user";

    }

    @PostMapping("/reserve")
    public String saveUser(@RequestParam("username") String username,
                           @RequestParam("phoneNumber") Long phoneNumber,
                           Model model) {
        return userService.save(username, phoneNumber);
    }



    }

