package br.edu.ifce.estruturas.vetor;

public class TesteAdicionaNoFim {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("João");
		a2.setNome("José");
		a3.setNome("maria");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		
		System.out.println(lista);
	}
	
}
