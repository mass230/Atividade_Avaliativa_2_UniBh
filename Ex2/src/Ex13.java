import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        /*Faça um programa que peça dois números, base e expoente,
         *calcule e mostre o primeiro número elevado ao segundo número. Não utilize a função de potência da linguagem.*/

         int Base=0, Expoente =0;
         float Resultado=1;



         System.out.println("Digite a base:");
         Base = scanner.nextInt();
         System.out.println("Digite o expoente:");
         Expoente = scanner.nextInt();
        
         for (int i = 0; i < Expoente; i++) {
            Resultado *= Base;
        }

        System.out.printf("O resultado de %d elevado a %d é: %.2f", Base, Expoente, Resultado);
         



        scanner.close();
    }
}
