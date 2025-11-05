import java.util.Scanner;

public class Somade1ateN {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = sc.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++) soma += i;
        System.out.println("Soma = " + soma);
    }
}
