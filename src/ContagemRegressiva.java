import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite N: ");
        int n = sc.nextInt();
        for (int i = n; i >= 0; i--)
            System.out.println(i);
    }
}
