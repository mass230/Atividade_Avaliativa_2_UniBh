import java.util.Scanner;

public class Ex6 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        /*Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
        * Depois modifique o programa para que ele mostre os números um ao lado do outro.*/
        int Progressao_numerica =0;

            System.out.println("Numeros um abaixo do outro");

        for (Progressao_numerica = 1; Progressao_numerica <= 20; Progressao_numerica++) {
            System.out.printf("\n%d\n", Progressao_numerica);
            scanner.close();
        }


        System.out.println("Numeros um ao lado do outro");

       /*  for (Progressao_numerica = 1; Progressao_numerica <= 20; Progressao_numerica++) {
            System.out.printf("%d _ ", Progressao_numerica);
            
        }*/


        for (Progressao_numerica= 1; Progressao_numerica <= 20; Progressao_numerica++) {
            System.out.print(Progressao_numerica + " ");

        }

    
    
        scanner.close();

    }
}
