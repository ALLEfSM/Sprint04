package br.com.fiap.insights.controller.Usuario;

import br.com.fiap.insights.dto.UserForm;
import br.com.fiap.insights.repository.RoleRepository;
import br.com.fiap.insights.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("registrar")
    public String cadastrar(Model model){
        model.addAttribute("usuario", new UserForm());
        model.addAttribute("roles", roleRepository.findAll());
        return "usuario/form";
    }

}
