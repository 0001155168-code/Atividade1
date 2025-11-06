import java.util.Scanner;
import java.util.Random;
public class JogoAdivinhacao {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        int numero = r.nextInt(10) + 1;
        int palpite;
        do {
            System.out.print("Adivinhe o número (1-10): ");
            palpite = sc.nextInt();
            if (palpite < numero) System.out.println("Muito baixo!");
            else if (palpite > numero) System.out.println("Muito alto!");
        } while (palpite != numero);
        System.out.println("Parabéns, acertou!");
    }
}
