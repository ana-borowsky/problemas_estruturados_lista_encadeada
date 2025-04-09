package lista_encadeada_fila;

public class ListaEncadeada {
    class No {
        int dado; 
        No proximo; 

        No(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    No inicio = null; 

    // método que verifica se a fila está vazia
    public boolean vazia() {
        return inicio == null;
    }

    // método que insere elemento na fila
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

    // método para remover elemento da fila
    public void remove() {
        if (this.vazia()) {
            System.out.println("Fila vazia!");
        } else {
            inicio = inicio.proximo;
        }
    }

    // Imprime a fila
    public void imprime() {
        if (this.vazia()) {
            System.out.println("Fila vazia!");
        } else {
            No atual = inicio;
            System.out.print("Fila: ");
            while (atual != null) {
                System.out.print(atual.dado + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Bem vindo ao programa de Fila com lista encadeada!\n");

        ListaEncadeada fila = new ListaEncadeada();
        fila.insere(20); 
        fila.insere(21); 
        fila.insere(35); 

        fila.imprime();

        fila.remove(); 
        fila.imprime(); 

        fila.remove(); 
        fila.imprime(); 

        fila.remove(); 
        fila.imprime(); 

        System.out.println("Fila está vazia? " + fila.vazia()); 
    }
}