package br.edu.ifce.estruturas.vetor;

public class TesteAdicionaNaPosicao {

	public static void main(String[] args ) {
		
		Vetor lista = new Vetor();
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		
		a1.setNome("mateus");
		a2.setNome("pedro");
		a3.setNome("joão");
		
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		System.out.println(lista);
		
		Aluno a4 = new Aluno();
		a4.setNome("jose");
		lista.adiciona(2, a4);
		
		System.out.println(lista);
		
	}
	}
