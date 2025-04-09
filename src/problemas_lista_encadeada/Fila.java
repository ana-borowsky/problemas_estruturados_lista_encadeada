package problemas_lista_encadeada;

import java.util.Scanner;

//Este é o programa da fila com estrutura de lista encadeada
public class Fila {
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
	    public int remove() {
	        if (this.vazia()) {
	            System.out.println("Fila vazia!");
	            return -1;
	        }
	        
	        int valorRemovido = inicio.dado;
	        inicio = inicio.proximo;
	        return valorRemovido;
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
	        Scanner scanner = new Scanner(System.in);
	        Fila fila = new Fila();

	        System.out.println("Bem-vindo ao programa de Fila com lista encadeada!\n");

	        int opcao;
	        do {
	            System.out.println("\n--- Menu ---");
	            System.out.println("1. Inserir número na fila");
	            System.out.println("2. Remover número da fila");
	            System.out.println("3. Imprimir fila");
	            System.out.println("0. Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o número a ser inserido: ");
	                    int numero = scanner.nextInt();
	                    fila.insere(numero);
	                    System.out.println("Número inserido com sucesso!");
	                    break;
	                case 2:
	                    int removido = fila.remove();
	                    if (removido != -1) {
	                        System.out.println("Número removido: " + removido);
	                    }
	                    break;
	                case 3:
	                    fila.imprime();
	                    break;
	                case 0:
	                    System.out.println("Encerrando o programa...");
	                    break;
	                default:
	                    System.out.println("Opção inválida, tente novamente.");
	            }
	        } while (opcao != 0);

	        scanner.close();
	    }
	}