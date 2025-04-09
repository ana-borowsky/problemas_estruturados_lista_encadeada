package lista_encadeada;
// Este é o programa da pilha com estrutura de lista encadeada

public class ListaEncadeada {
    class No {
        int dado; 
        No proximo;

        No(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }
    
    No inicio = null; // Referência para o primeiro nó da lista encadeada
    
    // Método que verifica se a pilha está vazia
    public boolean vazia() {
        return inicio == null;
    }
    
    // Método para inserir um elemento na pilha
    public void insere(int dado) {
        No novoNo = new No(dado); 
        if (this.vazia()) {
            inicio = novoNo;  
        } else { 
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo; 
            }
            atual.proximo = novoNo; 
        }
    }
    
    // Método para remover um elemento da pilha
    public void remove() {
        if (this.vazia()) {
            System.out.println("Pilha vazia!");
        } else {  
            // Se a pilha tiver apenas um nó
            if (inicio.proximo == null) {
                inicio = null;
            } else {  // Se a pilha tiver múltiplos nós
                No atual = inicio;
                while (atual.proximo.proximo != null) { 
                    atual = atual.proximo;
                }
                atual.proximo = null;
            }
        }
    }
        
    public void imprime() {
    	if (this.vazia()) {
    		System.out.println("Pilha vazia!");
    	} else {
        No atual = inicio; 
        System.out.print("Pilha: ");
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo; 
        }
        System.out.println();
    	}
    }

//Método main para testar o programa
public static void main(String[] args) {
	System.out.println("Bem vindo ao programa de Pilha que lista encadeada como estrutura!\n");
	
    ListaEncadeada pilha = new ListaEncadeada();
    pilha.insere(20);
    pilha.insere(21);
    pilha.insere(35);
    
    pilha.imprime();
    
    pilha.remove();
    pilha.imprime();
    
    pilha.remove(); 
    pilha.imprime(); 
    
    pilha.remove(); 
    pilha.imprime(); 
    System.out.println("Fila está vazia? " + pilha.vazia()); 
    
	}
}