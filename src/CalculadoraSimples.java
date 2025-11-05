import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

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
}
