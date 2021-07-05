package br.com.objectivesolutions;

public class Node {

	private String valor;
	private Node direita;
	private Node esquerda;
	
	public Node(String valor) {
		this.valor = valor;
	}
	
	public boolean isEsquerda() {
		return this.esquerda == null && this.direita == null;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Node getDireita() {
		return direita;
	}

	public void setDireita(Node direita) {
		this.direita = direita;
	}

	public Node getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Node esquerda) {
		this.esquerda = esquerda;
	}
	
}
