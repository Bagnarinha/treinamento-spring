package br.com.everis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.everis.entity.InfoFornecedor;

public interface FornecedorRepository extends JpaRepository<InfoFornecedor, Long> {

	InfoFornecedor findByEstado(String estado);
	
	
}
