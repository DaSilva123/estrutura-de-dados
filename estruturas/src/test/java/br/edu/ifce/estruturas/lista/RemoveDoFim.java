package br.edu.ifce.estruturas.lista;

public class RemoveDoFim {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
				
				lista.adiciona("maria");
				lista.adiciona("joão");
				lista.adiciona("jose");
				
				System.out.println(lista);
				
				lista.removeDoFim();
				System.out.println(lista);

			}

}
