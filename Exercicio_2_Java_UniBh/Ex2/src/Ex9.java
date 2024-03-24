import java.util.Scanner;


public class Ex9 {

public class Ex8 {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        /*Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.*/

        int impar=0;

        for (impar = 1;impar<=50; impar++){

            if (impar % 2 != 0) {
                System.out.println(impar);
            }
            scanner.close();
        };
        
    
    }
}

}
