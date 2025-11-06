import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

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
}
