import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Digite uma nota entre zero e dez: ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido! Por favor, digite uma nota entre zero e dez.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Você digitou a nota: " + nota);
        scanner.close();
    }
    
   
}
