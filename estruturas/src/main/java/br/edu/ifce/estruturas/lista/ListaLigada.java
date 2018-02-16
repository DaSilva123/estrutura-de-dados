package br.edu.ifce.estruturas.lista;

public class ListaLigada {

	private Celula primeira;
	private Celula ultima;
	
	private int totalDeElementos;
	
	public void adiciona(Object elemento) {
		if(this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		}else {
			Celula novoUltimo = new Celula(null, elemento);
			this.ultima.setProxima(novoUltimo);
			this.ultima = novoUltimo;		
			this.totalDeElementos++;
		}
	}
	
	public void adiciona(int posicao, Object elemento) {
		if(posicao == 0) {
			this.adicionaNoComeco(elemento);
		}else if(posicao == totalDeElementos) {
			this.adiciona(elemento);
		} else {
			Celula anterior  = this.pegaCelula(posicao-1);
			Celula nova = new Celula(anterior.getProxima(), elemento);
			anterior.setProxima(nova);
			this.totalDeElementos++;
		}
	}
	
	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(this.primeira, elemento);
		this.primeira = nova;
		
		if(this.totalDeElementos == 0) {
			this.ultima = this.primeira;
		}
		this.totalDeElementos++;
	}
	
	public Object pega(int posicao) {
	
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição invalida!");
		}
		
		return this.pegaCelula(posicao).getElemento();
	}
	


	private Celula pegaCelula(int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição Invalida!");
		}
		
		Celula atual = primeira;
		for(int i=0; i<posicao; i++) {
			atual = atual.getProxima();
		}
		
		return atual;
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
		
	}

	public void remove(int posicao) {
		if(posicao == 0) {
			this.removeDoComeco();
		}else if(posicao == this.totalDeElementos - 1) {
			this.removeDoFim();
		}else {
			Celula anterior = this.pegaCelula(posicao-1);
			Celula atual = anterior.getProxima();
			
			anterior.setProxima(atual.getProxima());
			this.totalDeElementos--;
		}
	}
	
	public void removeDoComeco() {
		this.primeira = this.primeira.getProxima();
		this.totalDeElementos--;
		
		if(this.totalDeElementos == 0) {
			this.ultima = null;
		}
	}
	
	public void removeDoFim() {
		if(this.totalDeElementos == 1) {
			this.removeDoComeco();
		}else {
			Celula penultimo = pegaCelula(totalDeElementos-1);
			penultimo.setProxima(null);
			this.ultima = penultimo;
			this.totalDeElementos--;
		}
	}
	
	public int tamanho() {
		return this.totalDeElementos;
		
	}
	public boolean contem(Object elemento) {
Celula atual = this.primeira;
		
		while(atual != null) {
			if(atual.getElemento().equals(elemento)) {
				return true;
			}
			atual = atual.getProxima();
		}
		return false;
	}
	
	
	public String toString() {
		
		if(this.totalDeElementos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder("[");
		Celula atual = primeira;
		
		// Percorrendo até o penúltimo elemento
		for(int i = 0; i < this.totalDeElementos-1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProxima();
		}
		
		//último elemento
		builder.append(atual.getElemento());
		builder.append("]");
		
		return builder.toString();
	}
}
