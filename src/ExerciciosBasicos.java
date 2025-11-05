import java.util.Scanner;

public class ExerciciosBasicos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello elieu!");

    }

}
import java.util.Scanner;
import java.util.Random;

public class ExerciciosBasicos {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Chame o exercício que quiser testar:
        // exemplo:
        // helloWorld();
        // somaSimples();
    }

    // 1. Hello World
    public static void helloWorld() {
        System.out.println("Hello, World!");
    }

    // 2. Declaração de Variáveis
    public static void declaracaoVariaveis() {
        int inteiro = 10;
        double real = 5.75;
        char letra = 'A';
        boolean verdade = true;

        System.out.println("int: " + inteiro);
        System.out.println("double: " + real);
        System.out.println("char: " + letra);
        System.out.println("boolean: " + verdade);
    }

    // 3. Soma Simples
    public static void somaSimples() {
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();
        System.out.println("Soma = " + (a + b));
    }

    // 4. Operações Matemáticas
    public static void operacoesMatematicas() {
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
    }

    // 5. Calculadora Simples
    public static void calculadoraSimples() {
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double resultado = 0;
        if (op == '+') resultado = a + b;
        else if (op == '-') resultado = a - b;
        else if (op == '*') resultado = a * b;
        else if (op == '/') resultado = a / b;
        else System.out.println("Operação inválida!");

        System.out.println("Resultado: " + resultado);
    }

    // 6. Par ou Ímpar
    public static void parOuImpar() {
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        System.out.println(n % 2 == 0 ? "Par" : "Ímpar");
    }

    // 7. Maior de Dois Números
    public static void maiorDeDois() {
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        System.out.println("Maior: " + (a > b ? a : b));
    }

    // 8. Classificação de Idade
    public static void classificacaoIdade() {
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        if (idade < 12) System.out.println("Criança");
        else if (idade < 18) System.out.println("Adolescente");
        else if (idade < 60) System.out.println("Adulto");
        else System.out.println("Idoso");
    }

    // 9. Conversor de Temperatura
    public static void conversorTemperatura() {
        System.out.print("Digite a temperatura: ");
        double temp = sc.nextDouble();
        System.out.print("Converter para (C/F): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        if (tipo == 'F')
            System.out.println("Fahrenheit: " + (temp * 9 / 5 + 32));
        else
            System.out.println("Celsius: " + ((temp - 32) * 5 / 9));
    }

    // 10. Tabuada
    public static void tabuada() {
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n * i));
    }

    // 11. Soma de 1 até N
    public static void somaAteN() {
        System.out.print("Digite N: ");
        int n = sc.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++) soma += i;
        System.out.println("Soma = " + soma);
    }

    // 12. Média de 3 Notas
    public static void mediaTresNotas() {
        double soma = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Nota " + i + ": ");
            soma += sc.nextDouble();
        }
        double media = soma / 3;
        System.out.println("Média = " + media);
        System.out.println(media >= 7 ? "Aprovado" : "Reprovado");
    }

    // 13. Número Positivo, Negativo ou Zero
    public static void positivoNegativoZero() {
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        if (n > 0) System.out.println("Positivo");
        else if (n < 0) System.out.println("Negativo");
        else System.out.println("Zero");
    }

    // 14. Ano Bissexto
    public static void anoBissexto() {
        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))
            System.out.println("Bissexto");
        else
            System.out.println("Não bissexto");
    }

    // 15. Tabuada Invertida
    public static void tabuadaInvertida() {
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        for (int i = 10; i >= 1; i--)
            System.out.println(n + " x " + i + " = " + (n * i));
    }

    // 16. Contador de Pares e Ímpares
    public static void contadorParesImpares() {
        System.out.print("Quantos números quer digitar? ");
        int q = sc.nextInt();
        int pares = 0, impares = 0;
        for (int i = 0; i < q; i++) {
            System.out.print("Número: ");
            int n = sc.nextInt();
            if (n % 2 == 0) pares++; else impares++;
        }
        System.out.println("Pares: " + pares + " | Ímpares: " + impares);
    }

    // 17. Simulação de Caixa Eletrônico
    public static void caixaEletronico() {
        System.out.print("Digite o valor: ");
        int valor = sc.nextInt();
        int[] notas = {100, 50, 20, 10, 5};

        for (int n : notas) {
            int qtd = valor / n;
            valor %= n;
            System.out.println("Notas de " + n + ": " + qtd);
        }
    }

    // 18. Número Primo
    public static void numeroPrimo() {
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        boolean primo = true;
        if (n <= 1) primo = false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++)
                if (n % i == 0) primo = false;
        }
        System.out.println(primo ? "Primo" : "Não primo");
    }

    // 19. Jogo de Adivinhação
    public static void jogoAdivinhacao() {
        Random r = new Random();
        int numero = r.nextInt(10) + 1;
        int palpite;
        do {
            System.out.print("Adivinhe o número (1-10): ");
            palpite = sc.nextInt();
            if (palpite < numero) System.out.println("Muito baixo!");
            else if (palpite > numero) System.out.println("Muito alto!");
        } while (palpite != numero);
        System.out.println("Parabéns, acertou!");
    }

    // 20. Conversor de Moeda
    public static void conversorMoeda() {
        System.out.print("Digite o valor em reais: R$ ");
        double reais = sc.nextDouble();
        System.out.print("Converter para (D/E): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        if (tipo == 'D')
            System.out.println("Em dólares: $" + (reais / 5.5));
        else
            System.out.println("Em euros: €" + (reais / 6.0));
    }

    // 21. Potência sem Math.pow
    public static void potencia() {
        System.out.print("Base: ");
        int a = sc.nextInt();
        System.out.print("Expoente: ");
        int b = sc.nextInt();
        int resultado = 1;
        for (int i = 0; i < b; i++) resultado *= a;
        System.out.println("Resultado: " + resultado);
    }

    // 22. Fatorial
    public static void fatorial() {
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        long fat = 1;
        for (int i = 1; i <= n; i++) fat *= i;
        System.out.println("Fatorial = " + fat);
    }

    // 23. Fibonacci
    public static void fibonacci() {
        System.out.print("Quantos termos? ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print("Sequência: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    // 24. Contagem Regressiva
    public static void contagemRegressiva() {
        System.out.print("Digite N: ");
        int n = sc.nextInt();
        for (int i = n; i >= 0; i--)
            System.out.println(i);
    }

    // 25. Soma de Pares
    public static void somaPares() {
        System.out.print("Digite N: ");
        int n = sc.nextInt();
        int soma = 0;
        for (int i = 2; i <= n; i += 2) soma += i;
        System.out.println("Soma dos pares = " + soma);
    }

    // 26. Soma de Ímpares
    public static void somaImpares() {
        System.out.print("Digite N: ");
        int n = sc.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i += 2) soma += i;
        System.out.println("Soma dos ímpares = " + soma);
    }

    // 27. Número Perfeito
    public static void numeroPerfeito() {
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        int soma = 0;
        for (int i = 1; i < n; i++)
            if (n % i == 0) soma += i;
        System.out.println(soma == n ? "Perfeito" : "Não perfeito");
    }

    // 28. Tabuada Completa
    public static void tabuadaCompleta() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i);
            for (int j = 1; j <= 10; j++)
                System.out.println(i + " x " + j + " = " + (i * j));
            System.out.println();
        }
    }

    // 29. Validação de Senha
    public static void validacaoSenha() {
        System.out.print("Digite uma senha: ");
        String senha = sc.next();
        if (senha.length() >= 6)
            System.out.println("Senha válida");
        else
            System.out.println("Senha muito curta (mínimo 6 caracteres)");
    }

    // 30. Maior e Menor de N Números
    public static void maiorMenorNNumeros() {
        System.out.print("Quantos números vai digitar? ");
        int n = sc.nextInt();
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Número: ");
            int num = sc.nextInt();
            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }
        System.out.println("Maior: " + maior + " | Menor: " + menor);
    }
}
