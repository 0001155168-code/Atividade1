import java.util.Scanner;

public class Potencia {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        int a = sc.nextInt();
        System.out.print("Expoente: ");
        int b = sc.nextInt();
        int resultado = 1;
        for (int i = 0; i < b; i++) resultado *= a;
        System.out.println("Resultado: " + resultado);
    }
}
