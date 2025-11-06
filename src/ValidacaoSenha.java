import java.util.Scanner;

public class ValidacaoSenha {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma senha: ");
        String senha = sc.next();
        if (senha.length() >= 6)
            System.out.println("Senha válida");
        else
            System.out.println("Senha muito curta (mínimo 6 caracteres)");
    }
}
