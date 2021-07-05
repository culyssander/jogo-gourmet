package br.com.objectivesolutions;

import javax.swing.JOptionPane;

public class Jogo {
	
	private ArvoreBinaria arvoreBinaria;
	private boolean loopInfinito = true;
	
	public Jogo() {
		this.arvoreBinaria = new ArvoreBinaria();
	}
	
	private void inicializarOJogoComQuestao() {
		this.arvoreBinaria.adicionar(null, "Massa", true);
		this.arvoreBinaria.adicionar(arvoreBinaria.getRaiz(), "Lazanha", true);
		this.arvoreBinaria.adicionar(this.arvoreBinaria.getRaiz(), "Bolo de chocolante", false);
	}
	
	public void iniciaOJogo() {
		if(this.arvoreBinaria.isVazio()) {
			inicializarOJogoComQuestao();
		}
		
		int iniciarACaixaDeDialogo = mostrarCaixaDeDialogo();
		
		if(iniciarACaixaDeDialogo == JOptionPane.CLOSED_OPTION) {
			loopInfinito = false;
		}
		
		while(loopInfinito) {
			advinha(this.arvoreBinaria.getRaiz());
		}
	}

	private int mostrarCaixaDeDialogo() {
		Object [] opcaoOk = {"Ok"};
		return JOptionPane.showOptionDialog(null, 
				"Pensa em um prato que gostas", 
				"Jogo Gourmet", 
				JOptionPane.PLAIN_MESSAGE, 
				JOptionPane.QUESTION_MESSAGE, 
				null, 
				opcaoOk, 
				opcaoOk[0]);
	}

	private void advinha(Node node) {
		String questao = String.format("O prato que voce pensou é %s ?", node.getValor());
		int resposta = JOptionPane.showConfirmDialog(null, questao, "Confirmar", JOptionPane.YES_NO_OPTION);
		
		if(resposta == JOptionPane.OK_OPTION) {
			if(node.isEsquerda()) {
				win();
			} else {
				advinha(node.getDireita());
			}
		} else {
			if(node.getDireita() == null) {
				perguntarPratoDoJogador(node);
			} else {
				advinha(node.getEsquerda());
			}
		}
	}

	private void perguntarPratoDoJogador(Node node) {
		String jogadorPensandoEm = JOptionPane.showInputDialog("Qual prato voce pensou?");
		String sugestao = JOptionPane.showInputDialog(String.format("%s é ______ %s não", jogadorPensandoEm, node.getValor()));
		mudarNodeDeAcordoComASugestao(node, sugestao, jogadorPensandoEm);		
	}

	private void mudarNodeDeAcordoComASugestao(Node node, String sugestao, String jogadorPensandoEm) {
		String adivinhaErrada = node.getValor();
		node.setValor(sugestao);
		node.setEsquerda(new Node(adivinhaErrada));
		node.setDireita(new Node(jogadorPensandoEm));
	}

	private void win() {
		JOptionPane.showMessageDialog(null, "Acertei de novo.");
		iniciaOJogo();
	}

	

}
