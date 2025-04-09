package problemas_lista_encadeada;

import java.util.Scanner;

//Este é o programa da pilha com estrutura de lista encadeada

public class Pilha {
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
	    public int remove() {
	        if (this.vazia()) {
	            System.out.println("Pilha vazia!");
	            return -1;
	        } else {
	            if (inicio.proximo == null) {
	                int valor = inicio.dado;
	                inicio = null;
	                return valor;
	            } else {
	                No atual = inicio;
	                while (atual.proximo.proximo != null) {
	                    atual = atual.proximo;
	                }
	                int valor = atual.proximo.dado;
	                atual.proximo = null;
	                return valor;
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
	        Scanner scanner = new Scanner(System.in);
	        Pilha pilha = new Pilha();

	        System.out.println("Bem-vindo ao programa de Pilha com lista encadeada!");

	        int opcao;
	        do {
	            System.out.println("\n--- Menu ---");
	            System.out.println("1. Inserir número na pilha");
	            System.out.println("2. Remover número da pilha");
	            System.out.println("3. Imprimir pilha");
	            System.out.println("0. Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o número a ser inserido: ");
	                    int numero = scanner.nextInt();
	                    pilha.insere(numero);
	                    System.out.println("Número inserido com sucesso!");
	                    break;
	                case 2:
	                    int removido = pilha.remove();
	                    if (removido != -1) {
	                        System.out.println("Número removido: " + removido);
	                    }
	                    break;
	                case 3:
	                    pilha.imprime();
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