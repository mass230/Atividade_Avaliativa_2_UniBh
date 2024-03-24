import java.util.Scanner;


public class Ex10 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        /*Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo
        * compreendido por eles.*/

        int n1=0,n2=0;


        System.out.print("Digite o primeiro numero: ");
        n1= scanner.nextInt();

        System.out.print("\nDigite o segundo numero: ");
        n2= scanner.nextInt();


        for (;n1 < n2; n1++) {
            
            System.out.printf(" %d",n1);
            scanner.close();
        };



        scanner.close();
    }
}


