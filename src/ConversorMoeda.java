import java.util.Scanner;

public class ConversorMoeda {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em reais: R$ ");
        double reais = sc.nextDouble();
        System.out.print("Converter para (D/E): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        if (tipo == 'D')
            System.out.println("Em dólares: $" + (reais / 5.5));
        else
            System.out.println("Em euros: €" + (reais / 6.0));
    }
}
