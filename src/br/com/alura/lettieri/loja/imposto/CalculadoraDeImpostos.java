package br.com.alura.lettieri.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.lettieri.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
