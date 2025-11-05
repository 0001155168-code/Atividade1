import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temp = sc.nextDouble();
        System.out.print("Converter para (C/F): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        if (tipo == 'F')
            System.out.println("Fahrenheit: " + (temp * 9 / 5 + 32));
        else
            System.out.println("Celsius: " + ((temp - 32) * 5 / 9));
    }
}
