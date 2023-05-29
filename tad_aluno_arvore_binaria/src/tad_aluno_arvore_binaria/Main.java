package tad_aluno_arvore_binaria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ArvoreAluno objAluno = new ArvoreAluno();

		objAluno.inserir(new Aluno("Pamera", 10, 10, 19));
		objAluno.inserir(new Aluno("Rayane", 8, 9, 2));
		objAluno.inserir(new Aluno("Rafael", 7, 6, 18));
		objAluno.inserir(new Aluno("Vini", 10, 8, 1));

		objAluno.relatorioAlunos();

		//Testando Pesquisar
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o id do aluno que deseja ver seus dados: ");
		int id = scanner.nextInt();
		Elemento aluno = objAluno.pesquisar(objAluno.getRaiz(), id);
		if(aluno != null){
			System.out.println(aluno.getObjA().toString());
		}
		else{System.out.println("Aluno não cadastrado!");}

		System.out.println("Digite o id do aluno que deseja verificar se foi aprovado: ");
		id = scanner.nextInt();

		objAluno.reprovado(objAluno.getRaiz(), id);

		System.out.println("--------------------------------------------------------------");
		System.out.println("A MENOR MÉDIA FOI: " + objAluno.menorMedia(objAluno.getRaiz()));
		System.out.println("--------------------------------------------------------------");
		System.out.println("A MAIOR MÉDIA FOI: " + objAluno.maiorMedia(objAluno.getRaiz()));
		System.out.println("--------------------------------------------------------------");

//		int x = objAluno.contar();
//		System.out.println("existem " + x + "alunos na  rvore");
	}

}
