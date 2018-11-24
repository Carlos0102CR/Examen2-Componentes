package com.cenfotec.finca.web;

import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cenfotec.finca.domain.Productor;
import com.cenfotec.finca.repository.ProductorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductorController {

	@Autowired
	ProductorRepository repo;

	@PostMapping("/productor/registrar")
	public String productorSubmit(@ModelAttribute Productor productor) {
		repo.save(productor);
		
		return "redirect:/productorVisualizar/" + productor.getId();
	}

	@GetMapping("/productorVisualizar/{id}")
	public String productorView(@PathVariable Long id, Model model) {
		Productor productor = repo.findById(id).get();
		model.addAttribute("productor", productor);
		
		return "productorVisualizar";
	}

	@GetMapping("/productorListar")
	public String productorList(Model model) {
		model.addAttribute("productoresLista", repo.findAll());
		model.addAttribute("productor", new Productor());
		
		return "productorListar";
	}

	@PostMapping("/productorListar")
	public String productorList(Model model,@ModelAttribute Productor productor) {
		model.addAttribute("productoresLista", repo.findByNombreContaining(productor.getNombre()));
		model.addAttribute("productor", new Productor());
		
		return "productorListar";
	}

	@RequestMapping("/")
	public String index(Model model) throws ParseException {
		model.addAttribute("productor", new Productor());
		
		return "productor";
	}
}
