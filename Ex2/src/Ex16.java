import java.util.Scanner;

public class Ex16 {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        /*A série de Fibonacci é formada pela seqüência 0,1,1,2,3,5,8,13,21,34,55,...
         *Faça um programa que gere a série até que o valor seja maior que 500.*/

         int Primeiro_Termo=0, Segundo_Termo=1, Proximo_Termo=0;

         System.out.println("Valor que seja maior que 500:");
         Primeiro_Termo=scanner.nextInt();
         
         while (Proximo_Termo <= 500) {
            System.out.print(Primeiro_Termo + " ");

            Proximo_Termo = Primeiro_Termo + Segundo_Termo;
            Primeiro_Termo=Segundo_Termo;
            Segundo_Termo=Proximo_Termo;

         }

        
         System.out.printf("O proximo numero da sequencia é: %d",Proximo_Termo );

        scanner.close();
    }
}
