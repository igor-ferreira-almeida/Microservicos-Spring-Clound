package br.com.microservicos.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservicos.loja.client.FornecedorClient;
import br.com.microservicos.loja.controller.dto.CompraDTO;
import br.com.microservicos.loja.controller.dto.InfoFornecedorDTO;

@Service
public class CompraService {
	
	@Autowired
	private FornecedorClient fornecedorClient;

	public void realiza(CompraDTO compraDTO) {
		InfoFornecedorDTO infoFornecedorDTO = fornecedorClient.buscaPorEstado(compraDTO.getEndereco().getEstado());
		System.out.println(infoFornecedorDTO.getEndereco());
	}

}
