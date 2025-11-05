import java.util.Scanner;

public class MaiordeDoisNumeros {
    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        System.out.println("Maior: " + (a > b ? a : b));
    }

}
