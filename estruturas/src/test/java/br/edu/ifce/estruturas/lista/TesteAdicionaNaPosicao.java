package br.edu.ifce.estruturas.lista;

public class TesteAdicionaNaPosicao {
	
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Roger");
		lista.adiciona("Stark");
		
		System.out.println(lista);
		
		lista.adiciona(0, "José");
		lista.adiciona(1, "Mario");
		lista.adiciona(1, "Gohan");
		lista.adiciona(5, "Vegeta");
		lista.adiciona(2, "trunks");
		
		System.out.println(lista);
	}

}
