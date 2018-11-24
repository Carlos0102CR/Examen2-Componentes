package com.cenfotec.finca.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.cenfotec.finca.domain.Cafe;
import com.cenfotec.finca.repository.CafeRepository;


@Controller
public class CafeController {

	
	@Autowired
	CafeRepository repo;
	
	@GetMapping("/cafe/{id}")
    public String cafeForm(@PathVariable Long id,Model model) {
		Cafe cafe = new Cafe();
		
		cafe.setIdFinca(id);
		model.addAttribute("cafe",cafe);
		
        return "cafe";
    }

    @PostMapping("/cafe/registrar")
    public String cafeSubmit(@ModelAttribute Cafe cafe) {
    	repo.save(cafe);
    	
        return "redirect:/cafeVisualizar/"+cafe.getId();
    }

	@GetMapping("/cafeListar/{idFinca}")
	public String cafeList(@PathVariable Long idFinca,Model model) {
		model.addAttribute("cafeLista", repo.findByidFinca(idFinca));
		return "cafeListar";
	}
    
    @GetMapping("/cafeVisualizar/{id}")
    public String cafeView(@PathVariable Long id,Model model) {
    	Cafe cafe = repo.findById(id).get();
    	
    	model.addAttribute("cafe",cafe);
    	
        return "cafeVisualizar";
    }
}
