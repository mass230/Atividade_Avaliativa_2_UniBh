import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        /*Faça um programa que, dado um conjunto de N números,
         *determine o menor valor, o maior valor e a soma dos valores.*/

         int Maior=0, Menor=0, Quantidade=0, Primeiro_Termo=0, Numero=0,Soma=0;


         System.out.print("Quantos números você quer inserir? ");
         Quantidade= scanner.nextInt();

         	// Solicita o primeiro número
	     System.out.print("Insira o 1º número: ");
	     Primeiro_Termo = scanner.nextInt();

	     // Inicializa 'menor' e 'maior' com o primeiro número
	     Menor= Primeiro_Termo;
	     Maior= Primeiro_Termo;

         for (int i = 1; i <= Quantidade; i++) {
            System.out.printf("Insira o %dº número: ", i);
            Numero = scanner.nextInt();

            if (Numero < Menor) {
                Menor= Numero;
            }

            if (Numero > Maior) {
                Maior= Numero;
            }

            Soma += Numero;
        }

    
        
        System.out.printf("Menor número: %d\n", Menor);
        System.out.printf("Maior número: %d\n", Maior);
        System.out.printf("Soma dos números: %d\n", Soma);


        scanner.close();
    }
}
