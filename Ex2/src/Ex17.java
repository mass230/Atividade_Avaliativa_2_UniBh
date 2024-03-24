import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        /*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
         *Ex.: 5!=5.4.3.2.1=120*/

         int Fatorial = 1, Numero=0;

         System.out.println("Digite um numero inteiro: ");
         Numero = scanner.nextInt();

         for (int i = 1;i <=Numero; i++){

            Fatorial *=i;
         }

         System.out.printf("O fatoria de %d é %d", Numero, Fatorial);



        scanner.close();
    }
}
