package br.edu.ifce.estruturas.lista;

public class TesteRemoveNaPosicao {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("maria");
		lista.adiciona("jõao");
		lista.adiciona("jose");
		lista.adiciona("francisco");
		
		
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);
		
		lista.remove(2);
		System.out.println(lista);


	}
	
}
