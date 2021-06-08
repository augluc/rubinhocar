package br.com.rubinhocar.modelo;

public class Veiculo {

	private String modelo;
	private float valor;
	private boolean status;
	private short ano;
	private short velocidadeAtual;
	// <modificador> <tipo do retorno> <nome do método> (<tipo do param> <nome do
	// param>)

	public void desacelerar(short velocidade) {
		if(status == true) {
			if(velocidade<=velocidadeAtual) {
				velocidadeAtual-=velocidade;
			}
		}
	}
	public void acelerar(short velocidade) {
		if(status == true) {
			velocidadeAtual += velocidade;		
		}
	}
	public void acelerar() {
		if(status == true) {
			velocidadeAtual += 10;		
		}
	}
	public float retornarDesconto() {
		return valor*(float)0.9;
	}
	public String retornarTudo() {
		String resposta = "SIM";
		if (status==false) {
			resposta="NÂO";
		}
		return
				"Modelo.............: " + modelo +"\n"+
				"Valor..............: " + valor +"\n"+
				"Ligado.............: " + resposta +"\n"+
				"Ano................: " + ano +"\n"+
				"Velocidade Atual...: " + velocidadeAtual;
	}
	public void preencherBasico(float pValor, short pAno) {
		valor = pValor;
		ano = pAno;
	}
	public String desligar() {
		status = false;
		velocidadeAtual = 0;
		return "Veículo Desligado";
	}

	public String ligar() {
		status = true;
		return "Veículo Ligado";
	}

	public String retornarModelo() {
		return modelo;
	}

	public void preencherModelo(String param) {
		if (param.length() < 10) {
			modelo = param.toUpperCase();
		}
	}

}
