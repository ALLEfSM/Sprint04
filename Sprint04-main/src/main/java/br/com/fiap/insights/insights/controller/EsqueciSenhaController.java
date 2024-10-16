package br.com.fiap.insights.insights.controller;

import br.com.fiap.insights.insights.model.Login;
import br.com.fiap.insights.insights.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EsqueciSenhaController {

    @Autowired
    private LoginRepository loginRepository;

    @GetMapping("/esqueci-senha")
    public String mostrarFormularioEsqueciSenha(Model model) {
        model.addAttribute("username", ""); // Para capturar o nome de usuário ou email
        return "login/esqueci-senha"; // Caminho para o template de "Esqueci Minha Senha"
    }

    @PostMapping("/esqueci-senha")
    public String enviarEmailRecuperacao(String username, Model model) {
        // Aqui você pode adicionar lógica para enviar um email de recuperação
        // Para fins de exemplo, vamos apenas redirecionar
        model.addAttribute("message", "Instruções de recuperação de senha foram enviadas para " + username);
        return "login/esqueci-senha"; // Retorna para o formulário com uma mensagem
    }
}
