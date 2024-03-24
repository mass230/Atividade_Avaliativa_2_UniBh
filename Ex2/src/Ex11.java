import java.util.Scanner;

public class Ex11 {
         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        /*Altere o programa anterior para mostrar no final a soma dos números.*/

        int n1=0,n2=0;
        int soma = 0;


        System.out.print("Digite o primeiro numero: ");
        n1= scanner.nextInt();

        System.out.print("\nDigite o segundo numero: ");
        n2= scanner.nextInt();


        for (;n1 < n2; n1++) {
            
            soma=soma+n1;

            scanner.close();
        };
        System.out.printf("soma=%d\n",soma);

        for (;n1 <= n2; n1++) {
            
            soma=soma+n1;

            scanner.close();
        };


        System.out.printf("soma=%d",soma);


        scanner.close();
    }
    
}
