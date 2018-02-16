package br.edu.ifce.estruturas.lista;

public class TestePegaElemento {

	public static void main(String[] args) {
ListaLigada lista = new ListaLigada();
		
		lista.adiciona("douglas");
		lista.adiciona("rafael");
		lista.adiciona(1, "joão");
		lista.adiciona( "maria");
		
		System.out.println(lista.pega(1));

	}

}
