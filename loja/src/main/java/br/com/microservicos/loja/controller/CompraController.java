package br.com.microservicos.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microservicos.loja.controller.dto.CompraDTO;
import br.com.microservicos.loja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;

	@PostMapping
	public void realiza(@RequestBody CompraDTO compraDTO) {
		compraService.realiza(compraDTO);
	}
	
}
