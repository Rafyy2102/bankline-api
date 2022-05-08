package com.dio.santander.bankline.api.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dio.santander.bankline.api.dto.MovimentacaoDto;
import com.dio.santander.bankline.api.model.*;
import com.dio.santander.bankline.api.repository.*;
import com.dio.santander.bankline.api.service.*;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
	
	@Autowired
	private MovimentacaoRepository movimentacaoRepository;
	
	@Autowired
	private MovimentacaoService movimentacaoService;
	
	@GetMapping
	public List<Movimentacao>findAll(){return movimentacaoRepository.findAll();}
	
	@PostMapping
	public void save(@RequestBody MovimentacaoDto movimentacao) {
		movimentacaoService.save(movimentacao);
	}
}