package br.com.alura.lettieri.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.lettieri.loja.orcamento.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);
	
}
