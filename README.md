# Exercício de estruturas em fila encadeada

Este projeto foi feito para a disciplina de resolução de problemas estruturados em computação.

Foram feitos os seguintes programas:
- FilaEstatica - Para montagem de filas estáticas
- FilaEncadeada - Para montagem de filas usando estrutura de fila encadeada
- PilhaEncadeada - Para montagem de pilhas usando estrutura de fila encadeada
- MergeFilasEncadeadas - Para fazer a união de filas encadeadas ordenadamente
- MergeFilasEstáticas - Para fazer a união de filas estáticas ordenadamente

## 📌 Funcionamento

### 🧮 FilaEncadeada
- Insere valores inteiros em uma estrutura de nós ligados.
- Permite remoção do início da fila.
- Verifica se a fila está vazia.
- Imprime os elementos da fila.

### 🧊 FilaEstatica
- Utiliza vetor com alocação circular.
- Controla inserções e remoções por meio de índices `primeiro` e `último`.
- Verifica se a fila está cheia ou vazia.
- Imprime todos os elementos na ordem correta.

### 🔀 MergeFilasEncadeadas & MergeFilasEstaticas
Ambas as classes realizam o mesmo processo:
1. Recebem dois conjuntos ordenados (filas A e B).
2. Fazem a união ordenada dos elementos.
3. Retornam uma nova fila com todos os elementos em ordem crescente (fila C).
4. Caso as filas estejam vazias, retorna fila vazia.

---

## ▶️ Execução

Cada classe tem um `main()` com um **menu interativo** (para filas) ou uma **demonstração prática** da união:

### Exemplo de Execução da União (Encadeada e Estática):

```
Conjunto A antes da união:
Fila: 4 10 23 39

Conjunto B antes da união:
Fila: 1 12 15 25 90

Resultado da união:
Fila: 1 4 10 12 15 23 25 39 90
```

---

## ✅ Como compilar e rodar

Compile todas as classes:

```bash
javac entrega2/*.java
```

Execute uma das classes com `main()` para testar:

```bash
java entrega2.MergeFilasEncadeadas
# ou
java entrega2.MergeFilasEstaticas
```

---

## 🛠️ Requisitos

- Java 8 ou superior
- Terminal ou IDE (Eclipse, IntelliJ, NetBeans, etc.)
