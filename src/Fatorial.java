import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        long fat = 1;
        for (int i = 1; i <= n; i++) fat *= i;
        System.out.println("Fatorial = " + fat);
    }
}
