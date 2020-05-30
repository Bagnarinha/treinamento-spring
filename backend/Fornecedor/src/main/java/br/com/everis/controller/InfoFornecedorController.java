package br.com.everis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.everis.dto.InfoFornecedorDTO;
import br.com.everis.entity.InfoFornecedor;
import br.com.everis.repository.FornecedorRepository;

@RestController
@RequestMapping("/info")
public class InfoFornecedorController {

	@Autowired
	private FornecedorRepository repository;
	
	@GetMapping("/{estado}")
	public InfoFornecedorDTO buscarFornecedorPorEstado(@PathVariable String estado) {
		
		InfoFornecedor infoFornecedor = repository.findByEstado(estado);
		
		return new InfoFornecedorDTO(infoFornecedor);
	}
	
}
