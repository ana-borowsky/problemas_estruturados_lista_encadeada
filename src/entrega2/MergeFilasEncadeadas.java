package entrega2;

import java.util.Scanner;

public class MergeFilasEncadeadas {
	public FilaEncadeada mergeFilasEncadeadas(FilaEncadeada conjuntoA, FilaEncadeada conjuntoB) {
	    FilaEncadeada conjuntoC = new FilaEncadeada();

	    if (conjuntoA.vazia() && conjuntoB.vazia()) {
	        return conjuntoC;
	    }

	    Integer elementoA = !conjuntoA.vazia() ? conjuntoA.remove() : null;
	    Integer elementoB = !conjuntoB.vazia() ? conjuntoB.remove() : null;

	    while (elementoA != null || elementoB != null) {
	        if (elementoA != null && (elementoB == null || elementoA <= elementoB)) {

	            conjuntoC.insere(elementoA);

	            if (!conjuntoA.vazia()) {
	                elementoA = conjuntoA.remove();
	            } else {
	                elementoA = null;
	            }

	        } else {
	            conjuntoC.insere(elementoB);
	            if (!conjuntoB.vazia()) {
	                elementoB = conjuntoB.remove();
	            } else {
	                elementoB = null;
	            }
	        }
	    }

	    return conjuntoC;
	}

    public static void main(String[] args) {
    	FilaEncadeada conjuntoA = new FilaEncadeada();
    	FilaEncadeada conjuntoB = new FilaEncadeada();

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

        MergeFilasEncadeadas uniao = new MergeFilasEncadeadas();
        FilaEncadeada resultado = uniao.mergeFilasEncadeadas(conjuntoA, conjuntoB);

        System.out.println("\nResultado da união:");
        resultado.imprime();
    }

}
