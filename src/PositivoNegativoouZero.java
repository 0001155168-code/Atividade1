import java.util.Scanner;

public class PositivoNegativoouZero {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        if (n > 0) System.out.println("Positivo");
        else if (n < 0) System.out.println("Negativo");
        else System.out.println("Zero");
    }
}
