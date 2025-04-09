package problemas_lista_encadeada;

import problemas_lista_encadeada.Fila;

public class Merge {
	// Método que faz a união de dois conjuntos, representados por filas. Ele assume que as filas estarão sempre ordenadas, conforme enunciado do professor.
	public Fila mergeFilas(Fila conjuntoA, Fila conjuntoB) {
		Fila uniao = new Fila();
		
		// Verificações para checar se alguma das filas é vazia.
		if (conjuntoA.vazia() || conjuntoB.vazia()) {
			System.out.println("Por favor insira duas listas válidas (ordenadas.");
		}
		
		// Pega os elementos iniciais das filas
		int elementoA = conjuntoA.remove();
		int elementoB = conjuntoB.remove();
		
		// insere ordenadamente os elementos das filas A e B na fila C até que uma delas acabe.
		while (!conjuntoA.vazia() || !conjuntoB.vazia())
			if (elementoA < elementoB) {
				uniao.insere(elementoA);
				elementoA = conjuntoA.remove();
			} else {
				uniao.insere(elementoB);
				elementoB = conjuntoB.remove();
			}
		
	    // Insere os elementos restantes caso uma das filas seja maior que a outra.
	    while (!conjuntoA.vazia()) {
			uniao.insere(elementoA);
			elementoA = conjuntoA.remove();
	    }
	    while (!conjuntoB.vazia()) {
	    	uniao.insere(elementoB);
			elementoB = conjuntoB.remove();
	    }
	    
		return uniao;
	}
public static void main(String[] args) {
    // Criando as filas de teste
    Fila filaA = new Fila();
    Fila filaB = new Fila();
    
    // Inserindo elementos ordenados na fila A
    filaA.insere(1);
    filaA.insere(3);
    filaA.insere(5);
    filaA.insere(7);
    
    // Inserindo elementos ordenados na fila B
    filaB.insere(2);
    filaB.insere(4);
    filaB.insere(6);
    filaB.insere(8);
    filaB.insere(10);
    
    System.out.println("Fila A antes do merge:");
    filaA.imprime();
    
    System.out.println("\nFila B antes do merge:");
    filaB.imprime();
    
    // Realizando o merge
    Merge merger = new Merge();
    Fila resultado = merger.mergeFilas(filaA, filaB);
    
    System.out.println("\nResultado do merge:");
    resultado.imprime();
    
}

}