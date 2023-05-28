package tad_aluno_arvore_binaria;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ArvoreAluno objAluno = new ArvoreAluno();

		objAluno.inserir(new Aluno("Pamera", 10, 10, 0));
		objAluno.inserir(new Aluno("Rayane", 8, 9, 2));
		objAluno.inserir(new Aluno("Rafael", 7, 6, 5));
		objAluno.inserir(new Aluno("Vini", 10, 8, 1));

		objAluno.preOrdem(objAluno.getRaiz());

		System.out.println("--------------------------------------------------------------");

		System.out.println("A MENOR MÉDIA FOI: " + objAluno.menorMedia(objAluno.getRaiz()));

		System.out.println("--------------------------------------------------------------");

		int x = objAluno.contar();
		System.out.println("existem " + x + "alunos na �rvore");
	}

}
