package com.example.ekz2.controllers;



import com.example.ekz2.dao.LoginForm;
import com.example.ekz2.entity.Groupi;
import com.example.ekz2.repository.GroupiRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.file.attribute.UserPrincipalNotFoundException;

@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {

    private GroupiRepository groupiRepository;

    public LoginController(GroupiRepository groupiRepository) {
        this.groupiRepository = groupiRepository;
    }

    @GetMapping
    public String getLogin() {
        log.info("login");
        return "login";
    }

    @PostMapping
    public String redirect(@ModelAttribute("loginForm") LoginForm loginForm) {
        try {
            Groupi groupi = groupiRepository.findByGroupa(loginForm.getGroupa())
                    .orElseThrow(() -> new UserPrincipalNotFoundException(
                            "User with username " +
                                    loginForm.getGroupa() +
                                    "is not found")
                    );
            if (groupi.getKafedra().equals(loginForm.getKafedra())) {

                    return "redirect:/groupi";

            }

            throw new UserPrincipalNotFoundException("Invalid password for user " + loginForm.getGroupa());
        } catch (UserPrincipalNotFoundException e) {
            log.warn(e.getMessage());
        }

        return null;
    }
}
