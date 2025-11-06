import java.util.Scanner;

public class MaioreMenordeNNumeros {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

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

