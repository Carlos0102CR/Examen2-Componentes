package com.cenfotec.finca.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.cenfotec.finca.domain.Finca;
import com.cenfotec.finca.repository.FincaRepository;


@Controller
public class FincaController {
	
	@Autowired
	FincaRepository repo;
	
	@PostMapping("/finca/{id}")
    public String fincaForm(@PathVariable Long id,Model model) {
		Finca finca = new Finca();
		finca.setIdProductor(id);
		model.addAttribute("finca",finca);
        return "finca";
    }

    @PostMapping("/finca/registrar")
    public String fincaSubmit(@ModelAttribute Finca finca) {
    	repo.save(finca);
        return "redirect:/fincaVisualizar/"+finca.getId();
    }
    
    @GetMapping("/fincaVisualizar/{id}")
    public String fincaView(@PathVariable Long id,Model model) {
    	Finca finca = repo.findById(id).get();
    	model.addAttribute("finca",finca);
    	
        return "fincaVisualizar";
    }
    
    @GetMapping("/fincaListar/{idProductor}")
    public String fincaList(@PathVariable Long idProductor,Model model) {
    	model.addAttribute("fincaLista",repo.findByidProductor(idProductor));
    	
        return "fincaListar";
    }
}
