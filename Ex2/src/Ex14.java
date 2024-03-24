import java.util.Scanner;

public class Ex14 {
    

     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        /*Faça um programa que peça 10 números inteiros,
        *calcule e mostre a quantidade de números pares e a quantidade de números impares.*/


        int Pares=0,Impar=0;

        System.out.println("digite os 10 numeros inteiros: ");
        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt();
            
            // Verifica se o número é par ou ímpar e atualiza a contagem correspondente
            if (numero % 2 == 0) {
                Pares++;
            } else {
                Impar++;
            }
        }


        System.out.printf("Quantidade de números pares = %d", Pares);
        System.out.printf("\nQuantiade de números impares= %d", Impar);

        scanner.close();
    }

}
