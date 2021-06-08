package br.com.rubinhocar.implementacao;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		
		Veiculo objeto = new Veiculo(); // instanciando um objeto
		objeto.preencherModelo("camaro");
		System.out.println(objeto.retornarModelo());
		System.out.println("Status: "+ objeto.ligar());
		System.out.println("Desligar: " + objeto.desligar());
		objeto.acelerar();
		objeto.acelerar((short)50);
		objeto.desacelerar((short)25);
		objeto.preencherBasico(100000, (short)2020);
		System.out.println(objeto.retornarTudo());
		System.out.println("Desconto: " + objeto.retornarDesconto());
	}

}
