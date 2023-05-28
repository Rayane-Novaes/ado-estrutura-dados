package tad_aluno_arvore_binaria;



public class ArvoreAluno {
	private Elemento raiz, atual;
    private int cont = 0, i = 0;
    int[] v;

    public int getI() {
        return i;
    }

    public Elemento getRaiz() {
        return raiz;
    }

    public void inserir(Aluno objA) {
        cont++;
        if (raiz == null) {
            raiz = new Elemento(objA);
        } else {
            atual = new Elemento(objA);
            inserir(atual, raiz);
        }
    }

    public void inserir(Elemento atual, Elemento elemento) {
        if (elemento.getObjA().getId() >= atual.getObjA().getId()) {
            if (elemento.getDireita() == null) {
                elemento.setDireita(atual);
                atual.setRaiz(elemento);
            } else {
                inserir(atual, elemento.getDireita());
            }
        } else {
            if (elemento.getEsquerda() == null) {
                elemento.setEsquerda(atual);
                atual.setRaiz(elemento);
            } else {
                inserir(atual, elemento.getEsquerda());
            }
        }
    }

    public void preOrdem(Elemento p) {
        if (p != null) {
            System.out.println(p.getObjA());
            preOrdem(p.getEsquerda());
            preOrdem(p.getDireita());
        }
    }

    public int contar() {
        Elemento e=raiz;
int         cont=0;
        while(e!=null){
        	cont++;
            e=e.getEsquerda();
            e=e.getDireita();
        }    	
        return cont;
    }

}
