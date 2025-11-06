import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        int valor = sc.nextInt();
        int[] notas = {100, 50, 20, 10, 5};

        for (int n : notas) {
            int qtd = valor / n;
            valor %= n;
            System.out.println("Notas de " + n + ": " + qtd);
        }
    }
}
