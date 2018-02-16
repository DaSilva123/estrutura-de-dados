package br.edu.ifce.estruturas.vetor;

public class TestePega {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		Aluno a5 = new Aluno();
		
		a1.setNome("Mateus");
		a2.setNome("Oliver");
		a3.setNome("Jon");
		a4.setNome("Sansa");
		a5.setNome("Arya");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		lista.adiciona(a4);
		lista.adiciona(a5);
		
		Aluno aluno1 = lista.pega(0);
		Aluno aluno2 = lista.pega(1);
		Aluno aluno3 = lista.pega(3);
		
		System.out.println(aluno1);
		System.out.println(aluno2);
		System.out.println(aluno3);

	}
}
