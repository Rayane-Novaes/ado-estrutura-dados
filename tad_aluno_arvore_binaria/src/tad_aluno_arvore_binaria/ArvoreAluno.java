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


    public double menorMedia(Elemento e){

        double menorMedia = e.getObjA().getMedia();

        if(e.getEsquerda() != null){

            double mediaEsquerda = menorMedia(e.getEsquerda());

            if (mediaEsquerda < menorMedia) {
                menorMedia = mediaEsquerda;
            }
        }

        if (e.getDireita() != null) {
            double mediaDireita = menorMedia(e.getDireita());
            if (mediaDireita < menorMedia) {
                menorMedia = mediaDireita;
            }
        }
        return menorMedia;
    }

        //Maior média

        public double maiorMedia(Elemento e) {
            double maiorMedia = e.getObjA().getMedia();
    
            if (e.getEsquerda() != null) {
                double mediaEsquerda = maiorMedia(e.getEsquerda());
                if (mediaEsquerda > maiorMedia) {
                    maiorMedia = mediaEsquerda;
                }
            }
    
            if (e.getDireita() != null) {
                double mediaDireita = maiorMedia(e.getDireita());
                if (mediaDireita > maiorMedia) {
                    maiorMedia = mediaDireita;
                }
            }
    
            return maiorMedia;
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
        int cont=0;
        while(e!=null){
        	cont++;
            e=e.getEsquerda();
            e=e.getDireita();
        }    	
        return cont;
    }

    public void relatorioAlunos() {
        System.out.println("Relatório de Alunos:");

        relatorioAlunosRecursivo(raiz);
    }

    /**
     * Método auxiliar para percorrer a árvore recursivamente e imprimir as informações dos alunos.
     * @param elemento O elemento raiz ou subárvore a ser percorrida.
     */
    private void relatorioAlunosRecursivo(Elemento elemento) {
        if (elemento != null) {
            Aluno aluno = elemento.getObjA();
            System.out.println(aluno);
            relatorioAlunosRecursivo(elemento.getEsquerda());
            relatorioAlunosRecursivo(elemento.getDireita());
        }
    }

}
