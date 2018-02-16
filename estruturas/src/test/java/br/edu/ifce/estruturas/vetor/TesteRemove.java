package br.edu.ifce.estruturas.vetor;

public class TesteRemove {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		Aluno a5 = new Aluno();
		Aluno a6 = new Aluno();
		Aluno a7 = new Aluno();
		
		
		a1.setNome("Mateus");
		a2.setNome("Oliver");
		a3.setNome("Jon");
		a4.setNome("Sansa");
		a5.setNome("Arya");
		a6.setNome("ned");
		a7.setNome("rob");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		lista.adiciona(a4);
		lista.adiciona(a5);
		lista.adiciona(a6);
		lista.adiciona(a7);
		
		System.out.println(lista);
		
		lista.remove(3);
		lista.remove(5);
		
		System.out.println(lista);
		
		
		
	}
}
