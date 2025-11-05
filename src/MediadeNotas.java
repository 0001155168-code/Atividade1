import java.util.Scanner;

public class MediadeNotas {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double soma = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Nota " + i + ": ");
            soma += sc.nextDouble();
        }
        double media = soma / 3;
        System.out.println("Média = " + media);
        System.out.println(media >= 7 ? "Aprovado" : "Reprovado");
    }
}
