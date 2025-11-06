import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = sc.nextInt();
        int soma = 0;
        for (int i = 2; i <= n; i += 2) soma += i;
        System.out.println("Soma dos pares = " + soma);
    }

}
