package entrega2;

public class MergeFilasEstaticas {
	public FilaEstatica merge(FilaEstatica conjuntoA, FilaEstatica conjuntoB) {
		FilaEstatica conjuntoC = new FilaEstatica(conjuntoA.capacidade + conjuntoB.capacidade);

        if (conjuntoA.vazia() && conjuntoB.vazia()) {
            return conjuntoC;
        }

        boolean aindaTemA = !conjuntoA.vazia();
        boolean aindaTemB = !conjuntoB.vazia();

        int elementoA = aindaTemA ? conjuntoA.remove() : 0;
        int elementoB = aindaTemB ? conjuntoB.remove() : 0;

        while (aindaTemA || aindaTemB) {
            if (aindaTemA && (!aindaTemB || elementoA <= elementoB)) {
                conjuntoC.insere(elementoA);
                if (!conjuntoA.vazia()) {
                	elementoA = conjuntoA.remove();
                } else {
                    aindaTemA = false;
                }
            } else {
                conjuntoC.insere(elementoB);
                if (!conjuntoB.vazia()) {
                	elementoB = conjuntoB.remove();
                } else {
                    aindaTemB = false;
                }
            }
        }

        return conjuntoC;
    }

    public static void main(String[] args) {
    	System.out.println("Bem-vindo ao programa de união de filas estáticas :)\n");
    	
        FilaEstatica conjuntoA = new FilaEstatica(5);
        FilaEstatica conjuntoB = new FilaEstatica(6);

        conjuntoA.insere(4);
        conjuntoA.insere(10);
        conjuntoA.insere(23);
        conjuntoA.insere(39);

        conjuntoB.insere(1);
        conjuntoB.insere(12);
        conjuntoB.insere(15);
        conjuntoB.insere(25);
        conjuntoB.insere(90);

        System.out.println("Conjunto A antes da união:");
        conjuntoA.imprime();

        System.out.println("\nConjunto B antes da união:");
        conjuntoB.imprime();

        MergeFilasEstaticas uniao = new MergeFilasEstaticas();
        FilaEstatica resultado = uniao.merge(conjuntoA, conjuntoB);

        System.out.println("\nResultado da união:");
        resultado.imprime();
    }
}
