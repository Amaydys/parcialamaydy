package co.edu.usco.pw.springboot_crud01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/info")
public class InfoController {

    @GetMapping
    public String viewAdminInfo(Model model) {
        String adminInfo = "Esta es la información registrada por el administrador.";
        model.addAttribute("adminInfo", adminInfo);
        return "list-vehiculo"; // El nombre de la vista que mostrará la información
    }
}
