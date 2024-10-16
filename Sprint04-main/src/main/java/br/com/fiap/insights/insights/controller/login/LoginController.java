package br.com.fiap.insights.insights.controller.login;

import br.com.fiap.insights.insights.model.Login;
import br.com.fiap.insights.insights.repository.LoginRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

    @GetMapping
    public String loginForm(Login login, Model model) {
        return "templates/login";
    }

    @PostMapping
    public String login(@Valid Login login, RedirectAttributes redirectAttributes) {
        boolean isAuthenticated = authenticateUser(login.getUsername(), login.getPassword());

        if (!isAuthenticated) {
            redirectAttributes.addFlashAttribute("error", "Usuário ou senha inválidos.");
            return "redirect:/login";
        }

        return "redirect:/home";
    }

    private boolean authenticateUser(String username, String password) {
        return "admin".equals(username) && "senha123".equals(password);
    }
}
