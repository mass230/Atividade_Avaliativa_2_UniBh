import java.util.Scanner;

public class Ex8 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        /*Faça um programa que leia 5 números e informe a soma e a média dos números.*/

        int n1=0,n2=0,n3=0,n4=0,n5=0;
        int soma=0;
        double media=0;



        System.out.print("Digite o primeiro numero: ");
        n1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        n2 = scanner.nextInt();
        System.out.print("Digite o terceiro numero: ");
        n3 = scanner.nextInt();
        System.out.print("Digite o quarto numero: ");
        n4 = scanner.nextInt();
        System.out.print("Digite o quinto numero: ");
        n5 = scanner.nextInt();

        soma= n1+n2+n3+n4+n5;
        System.out.printf("A soma é igual á: %d\n", soma);

        media=(n1+n2+n3+n4+n5)/5.0;
        System.out.printf("A media é igual á: %.2f", media);

    
        scanner.close();
    }
}
