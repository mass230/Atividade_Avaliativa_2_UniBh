import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /*Faça um programa que leia 5 números e informe o maior número.*/



        int n1=0,n2=0,n3=0,n4=0,n5=0;
        int Maior_numero= n1;
        
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

            if (n2 > Maior_numero) {
                Maior_numero = n2;
            }
            if (n3 > Maior_numero) {
                Maior_numero = n3;
            }
            if (n4 > Maior_numero) {
                Maior_numero = n4;
            }
            if (n5 > Maior_numero) {
                Maior_numero = n5;
            }
            System.out.printf("\nO maior número é:%d", Maior_numero);
        
        
        scanner.close();
    }
    
}
