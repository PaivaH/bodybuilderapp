package br.edu.infnet.agenciaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.agenciaapp.model.service.ClinicaService;

@Controller
public class ClinicaController {
    @Autowired
    private ClinicaService clinicaService;

    @GetMapping(value = "/clinica/lista")
    public String telaHome(Model model) {
        model.addAttribute("listagem", clinicaService.obterClinicas());

        return "/clinica/lista";
    }

    @GetMapping(value = "/clinica/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        clinicaService.excluir(id);

        return "redirect:/clinica/lista";
    }
}
