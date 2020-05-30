package br.com.everis.dto;

import br.com.everis.entity.InfoFornecedor;

public class InfoFornecedorDTO {

	private String endereco;
	
	public InfoFornecedorDTO(InfoFornecedor infoFornecedor) {
		endereco = infoFornecedor.getEndereco();
	}

	public String getEndereco() {
		return endereco;
	}

}
