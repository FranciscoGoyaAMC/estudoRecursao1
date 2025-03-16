public class exercicioRecursao1
{
    /*
    Exercício 1. O que é recursão? O que é necessário para que um método recursivo esteja implementado de forma correta?
    
    Recursão é uma técnina onde um metódo chama a si mesmo. Para ele ser bem implementado ele deve conter uma caso base,
    para parar a recursão e o retorno dele deve conter o passo recursivo, onde ele deve retornar própria função, com um
    argumento modificado. Caso não tenha o metódo chamara a si indefinidamente, resultando em um erro de StackOverflow.
    */

    /*
    Exercício 2. Seja a definição recursiva abaixo:

    metodo(x) = 1, se x <= 1
    metodo(x) = x * 2 + metodo(x - 1), se x > 1
    
    Qual o resultado do método acima para as seguintes chamadas:
    metodo(4) = 19
    metodo(-3) = 1
    metodo(6) = 41
    */

    public static int exercicio2(int x)
    {
        if (x <= 1)
        {
            return 1;
        }
        return ((x * 2) + exercicio2(x-1));
    }

    /*
    Exercício 3. Seja a definição recursiva abaixo:

    metodo(a, b) = a, se b <= 1
    metodo(a, b) = metodo(b, a/b), se b > 1
    
    Qual o resultado do método acima para as seguintes chamadas:
    metodo(5, 3) = 3
    metodo(15, 3) = 5
    metodo(28, -45) = 28
    */

    public static int exercicio3(int a, int b)
    {
        if (b <= 1)
        {
            return a;
        }
        return exercicio3(b, a/b);
    }

    /*
    Exercício 4. A Sequência de Ackerman é dada por:
    A(m, n) = n + 1, se m = 0 
    A(m, n) = A(m − 1, 1), se m != 0 e n = 0 
    A(m, n) = A(m − 1, A(m, n − 1)), se m != 0 e n != 0
    
    Sabendo disto, implemente o método A descrito acima.
    */

    public static int exercicio4(int m, int n)
    {
        if (m == 0)
        {
            return (n + 1);
        }
        else if (n == 0)
        {
            return exercicio4(m - 1,1);
        }
        else
        {
            return exercicio4(m - 1, exercicio4(m, n - 1));
        }
    }

    /*
    Exercício 5. Crie um método recursivo para calcular a soma dos inteiros de 1 a n, sendo n >= 1.
    */

    public static int exercicio5(int n) throws IllegalArgumentException
    {
        if (n < 1)
        {
            throw new IllegalArgumentException();
        }
        else if (n == 1)
        {
            return 1;
        }
        return (n + exercicio5(n-1));
    }

    /*
    Exercício 6. Escreva um método recursivo que retorne a soma dos elementos de um array v contendo t elementos.
    */
    
    public static int exercicio6(int[] v, int t)
    {
        if (t == 0)
        {
            return 0;
        }
        return (v[t-1] + exercicio6(v, t-1));
    }

    /*
    Exercício 7. Seja o método abaixo:

    public static int f(int x){
    int res;
    if(x < 4) res = 3 * x;
    else res = 2 * f(x - 4) + 5;
    return res;
    }

    Qual o resultado para as chamadas:

    f(2) = 6
    f(4) = 5
    f(9) = 27
    */
    
    public static int f(int x)
    {
        int res;
        if(x < 4) res = 3 * x;
        else res = 2 * f(x - 4) + 5;
        return res;
    }

    /*
    Exercício 8. Implemente um método recursivo que verifica se uma palavra é um palíndromo (Ex.: ana, renner). Para isso considere a seguinte assinatura:

    public boolean isPalindrome(char word[])
    A palavra será passada ao método como um array de caracteres (parâmetro word), contendo uma letra em cada posição — ex.: {‘a’, ‘n’, ‘a’}.
    */

    public static boolean isPalindrome(char word[]) throws IllegalArgumentException
    {
        if(word == null)
        {
        throw new IllegalArgumentException();
        }
        return isPalindrome(word, 0, word.length-1);
    }
        
    private static boolean isPalindrome(char[] word, int i, int j)
    {
        if (i >= j)
        {
            return true;
        }     
        if (word[i] != word[j])
        {
            return false;
        } 
        return isPalindrome(word, i + 1, j - 1);
    }

    

    public static void main(String[] args) 
    {
        //Exercício 2:
        int resp1 = exercicio2(4);
        int resp2 = exercicio2(-3);
        int resp3 = exercicio2(6);
        
        System.out.println("Chamando o método do exercício 2 para:\n 4 = " + resp1 + "\n -3 = " + resp2 + "\n 6 = " + resp3);

        //Exercício 3:
        int resp4 = exercicio3(5,3);
        int resp5 = exercicio3(15,3);
        int resp6 = exercicio3(28,-45);
        System.out.println("Chamando o método do exercício 3 para:\n (5, 3) = " + resp4 + "\n (15, 3) = " + resp5 + "\n (28, -45) = " + resp6);
    
        //Exercício 4:
        int resp7 = exercicio4(2,3); //Saída esperada: 9
        System.out.println("Testando método do exercício 4 com valores (2,3) para ver se está rodando corretamente:\n " + resp7);
    
        //Exercício 5:
        try
        {
        System.out.println("Teste exercíco 5 passando 10 de argumento: " + exercicio5(10)); //Saída esperada: 55
        System.out.println(exercicio5(0));  //Deve lançar IllegalArgumentException
        }
        catch (IllegalArgumentException e)
        {
        System.out.println("Erro: Entrada inválida. O número deve ser maior ou igual a 1.");
        }

        //Exercício 6:
        int[] array = {1, 2, 3, 4, 5}; 
        int resp8 = exercicio6(array, array.length);
        System.out.println("A soma dos elementos é: " + resp8); //Saída esperada: 15

        //Exercício 7:
        int resp9 = f(2);
        int resp10 = f(4);
        int resp11 = f(9);
        System.out.println("Respostas do exercício 7 para as entradas:\n f(2): " + resp9 + "\n f(4): " + resp10 + "\n f(9): " + resp11);
    
        System.out.println();
        //Exercício 8:
        char[] word1 = {'a', 'n', 'a'};
        char[] word2 = {'r', 'e', 'n', 'n', 'e', 'r'};
        char[] word3 = {'t', 'e', 's', 't'};
        
        System.out.println(isPalindrome(word1)); // true
        System.out.println(isPalindrome(word2)); // true
        System.out.println(isPalindrome(word3)); // false
    }
}