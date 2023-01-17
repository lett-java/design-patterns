package br.com.alura.lettieri.loja;

import java.math.BigDecimal;

import br.com.alura.lettieri.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.lettieri.loja.imposto.ICMS;
import br.com.alura.lettieri.loja.imposto.ISS;
import br.com.alura.lettieri.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		
		System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));
		System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));
	}
	
}
