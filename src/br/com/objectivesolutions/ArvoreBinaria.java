package br.com.objectivesolutions;

public class ArvoreBinaria {

	private Node raiz;
	
	public boolean isVazio() {
		return raiz == null;
	}
	
	public void adicionar(Node pai, String valor, boolean escolha) {
		this.raiz = adicionarNovoNode(pai, valor, escolha);
	}
	
	private Node adicionarNovoNode(Node pai, String valor, boolean escolha) {
		if(pai == null) {
			pai = new Node(valor);
			return pai;
		} else if(escolha) {
			pai.setDireita(adicionarNovoNode(pai.getDireita(), valor, escolha));
		}else {
			pai.setEsquerda(adicionarNovoNode(pai.getEsquerda(), valor, escolha));
		}
		return pai;
	}

	public Node getRaiz() {
		return raiz;
	}
	
}
