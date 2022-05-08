package com.dio.santander.bankline.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dio.santander.bankline.api.dto.CorrentistaDto;
import com.dio.santander.bankline.api.model.Correntista;
import com.dio.santander.bankline.api.repository.CorrentistaRepository;
import com.dio.santander.bankline.api.service.CorrentistaService;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {
	
	@Autowired
	private CorrentistaRepository correntistaRepository;
	
	@Autowired
	private CorrentistaService correntistaService;
	
	@GetMapping
	public List<Correntista>findAll(){return correntistaRepository.findAll();}
	
	@PostMapping
	public void save(@RequestBody CorrentistaDto correntista) {
		correntistaService.save(correntista);
	}
}