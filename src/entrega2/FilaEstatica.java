package entrega2;

import java.util.Scanner;

public class FilaEstatica {
    private int primeiro;
    private int ultimo;
    private int[] dados;
    private int capacidade;
    private int tamanhoAtual;

    public FilaEstatica(int capacidade) {
        if (capacidade <= 0) {
            System.out.println("Capacidade precisa ser maior que zero!");
            return;
        }
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.primeiro = -1;
        this.ultimo = -1;
        this.tamanhoAtual = 0;
    }

    public boolean cheia() {
        return tamanhoAtual == capacidade;
    }

    public boolean vazia() {
        return tamanhoAtual == 0;
    }

    public void insere(int dado) {
        if (this.cheia()) {
            System.out.println("Fila cheia! Para inserir um número, por favor remova algum primeiro.");
            return;
        }

        if (this.vazia()) {
            primeiro = 0;
        }

        ultimo = (ultimo + 1) % capacidade;
        dados[ultimo] = dado;
        tamanhoAtual++;
    }

    public int remove() {
        if (this.vazia()) {
            System.out.println("Não é possível remover pois a fila está vazia.");
            return -1;
        }

        int dadoRemovido = dados[primeiro];

        if (primeiro == ultimo) {
            primeiro = ultimo = -1;
        } else {
            primeiro = (primeiro + 1) % capacidade;
        }

        tamanhoAtual--;

        return dadoRemovido;
    }

    public void imprime() {
        if (this.vazia()) {
            System.out.println("A fila está vazia.");
            return;
        }

        System.out.println("Fila atual: ");

        int i = 0;
        while (i < tamanhoAtual) {
            int index = (primeiro + i) % capacidade;
            System.out.println(dados[index]);
            i++;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao programa de Fila Estática!\n");

        System.out.print("Digite a capacidade da fila: ");
        int capacidade = scanner.nextInt();
        FilaEstatica fila = new FilaEstatica(capacidade);

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
