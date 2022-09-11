package br.edu.infnet.agenciaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.agenciaapp.model.service.ResponsavelService;

@Controller
public class ResponsavelController {
    @Autowired
    ResponsavelService responsavelService;

    @GetMapping(value = "/responsavel/lista")
    public String telaHome(Model model) {
        model.addAttribute("listagem", responsavelService.obterProfissionals());

        return "/responsavel/lista";
    }

    @GetMapping(value = "/responsavel/{id}/excluir")
    public String exclusao(@PathVariable Integer id) {
        responsavelService.excluir(id);

        return "redirect:/responsavel/lista";
    }
}
