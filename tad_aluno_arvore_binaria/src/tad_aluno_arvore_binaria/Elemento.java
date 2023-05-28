package tad_aluno_arvore_binaria;



public class Elemento {


private Elemento esquerda, direita, raiz;
private Object objeto;
private Aluno objA;
public Elemento(Object objeto){
	this.objeto = objeto;
}

public Elemento(Aluno objA) {
	this.objA=objA;
}

public Aluno getObjA() {
	return objA;
}


public void setObjA(Aluno objA) {
	this.objA = objA;
}


public Elemento getEsquerda() {
	return esquerda;
}

public void setEsquerda(Elemento esquerda) {
	this.esquerda= esquerda;
}

public Elemento getDireita() {
	return direita;
}

public void setDireita(Elemento direita) {
	this.direita = direita;
}

public Elemento getRaiz() {
	return raiz;
}

public void setRaiz(Elemento raiz) {
	this.raiz = raiz;
}

public Object getObjeto() {
	return objeto;
}

public void setObjeto(Object objeto) {
	this.objeto = objeto;
}


}
