import java.util.Scanner;

public class ContadorParesImpares {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

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
}
