package tad_aluno_arvore_binaria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArvoreAluno objAluno = new ArvoreAluno();

objAluno.inserir(new Aluno("Pamera", 10, 10, 10, 0));
objAluno.inserir(new Aluno("Rayane", 10, 10, 10, 0));
objAluno.inserir(new Aluno("Rafael", 10, 10, 10, 0));
objAluno.inserir(new Aluno("Vini", 10, 10, 10, 0));

objAluno.preOrdem(objAluno.getRaiz());

int x=objAluno.contar();
System.out.println("existem " + x + "alunos na �rvore");
	}

}
