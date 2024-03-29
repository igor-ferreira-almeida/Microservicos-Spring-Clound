package br.com.microservicos.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.microservicos.fornecedor.model.InfoFornecedor;
import br.com.microservicos.fornecedor.repository.InfoRepository;

@Service
public class InfoService {
	
	@Autowired
	private InfoRepository infoRepository;

	public InfoFornecedor buscaPorEstado(String estado) {
		return infoRepository.findByEstado(estado);
	}

}
