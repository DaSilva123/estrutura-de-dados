package br.edu.ifce.estruturas.lista;

public class TesteRemoveDoComeco {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("maria");
		lista.adiciona("joão");
		
		
		System.out.println(lista);
		
		lista.removeDoComeco();
		System.out.println(lista);

	}
}
