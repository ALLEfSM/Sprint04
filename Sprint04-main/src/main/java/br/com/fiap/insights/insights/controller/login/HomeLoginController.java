package br.com.fiap.insights.insights.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeLoginController {

    @GetMapping("/homeLogin")
    public String home() {
        return "login/loginhome";
    }
}
