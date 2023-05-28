package tad_aluno_arvore_binaria;

public class Aluno {
private String nome;
double p1, p2, media;
int id, faltas;
private static int valor=1;

public Aluno() {
this.id=valor++;	
}

public Aluno(String nome, double p1, double p2, double media, int faltas) {
	this.nome=nome;
	this.p1=p1;
	this.p2=p2;
	this.media=media;
	this.faltas=faltas;
	this.id=valor++;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public double getP1() {
	return p1;
}
public void setP1(double p1) {
	this.p1 = p1;
}
public double getP2() {
	return p2;
}
public void setP2(double p2) {
	this.p2 = p2;
}
public double getMedia() {
	return media;
}
public void setMedia(double media) {
	this.media = media;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getFaltas() {
	return faltas;
}
public void setFaltas(int faltas) {
	this.faltas = faltas;
}

	public String toString() {
		return "Aluno{" +
				"nome='" + nome + '\'' +
				", p1=" + p1 +
				", p2=" + p2 +
				", media=" + media +
				", id=" + id +
				", faltas=" + faltas +
				'}';
	}
}
