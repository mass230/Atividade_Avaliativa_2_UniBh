import java.util.Scanner;


public class Ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        String nome, senha;
    
        do {
            System.out.print("Digite o nome: ");
            nome = scanner.next();
    
            System.out.print("Digite a senha: ");
            senha = scanner.next();

            if (senha.equals(nome)) {
                System.out.println("Senha inválida");
            }

        } while (senha.equals(nome));
        scanner.close();
        
    }
}



  