# Estudos de Recursão em Java

Este repositório contém exercícios resolvidos sobre recursão na linguagem Java. Os códigos foram desenvolvidos como parte do aprendizado de algoritmos recursivos.

## Conteúdo

O arquivo principal do projeto é `exercicioRecursao1.java`, que implementa as soluções para os seguintes exercícios:

### Exercício 1: Conceito de Recursão
- Explicação teórica sobre o conceito de recursão e os requisitos para uma implementação correta.

### Exercício 2: Função Recursiva Simples
- Implementa um método recursivo que segue a definição:
  ```
  metodo(x) = 1, se x <= 1
  metodo(x) = x * 2 + metodo(x - 1), se x > 1
  ```

### Exercício 3: Recursão com Dois Parâmetros
- Implementa um método recursivo baseado na definição:
  ```
  metodo(a, b) = a, se b <= 1
  metodo(a, b) = metodo(b, a/b), se b > 1
  ```

### Exercício 4: Função de Ackermann
- Implementa a função de Ackermann:
  ```
  A(m, n) = n + 1, se m = 0
  A(m, n) = A(m - 1, 1), se m != 0 e n = 0
  A(m, n) = A(m - 1, A(m, n - 1)), se m != 0 e n != 0
  ```

### Exercício 5: Soma Recursiva
- Calcula a soma dos inteiros de 1 a `n`, sendo `n >= 1`.

### Exercício 6: Soma de Elementos de um Array
- Calcula recursivamente a soma dos elementos de um array de tamanho `t`.

### Exercício 7: Análise de Função Recursiva
- Avalia a função:
  ```
  public static int f(int x) {
      int res;
      if (x < 4) res = 3 * x;
      else res = 2 * f(x - 4) + 5;
      return res;
  }
  ```
- Resultados esperados:
  - `f(2) = 6`
  - `f(4) = 5`
  - `f(9) = 27`

### Exercício 8: Verificação de Palíndromos
- Implementa um método recursivo para verificar se uma palavra é um palíndromo.

## Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/FranciscoGoyaAMC/estudoRecursao1.git
   ```
2. Compile o arquivo Java:
   ```bash
   javac exercicioRecursao1.java
   ```
3. Execute o programa:
   ```bash
   java exercicioRecursao1
   ```

## Contato

Para sugestões, dúvidas ou melhorias, fique à vontade para abrir uma _issue_ ou entrar em contato!

---

Este projeto faz parte dos estudos de Programação II na Unisinos.

