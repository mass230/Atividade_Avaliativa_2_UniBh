import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        /*Altere o programa anterior para que ele
         *aceite apenas números entre 0 e 1000.*/

         int Maior=0, Menor=Integer.MAX_VALUE, Numero=0,Soma=0;



         for (int i = 1; i <= 5; i++) {
            System.out.printf("Insira o %dº número: ", i);
            Numero = scanner.nextInt();
            
            // Verifica se o número está dentro do intervalo desejado
            if (Numero >= 0 && Numero <= 1000) {
                Soma += Numero;
                Menor = Math.min(Menor, Numero);
                Maior = Math.max(Maior, Numero);
            } else {
                System.out.println("Número fora do intervalo permitido.");
                i--;
            }
        }

    
        
        System.out.printf("Menor número: %d\n", Menor);
        System.out.printf("Maior número: %d\n", Maior);
        System.out.printf("Soma dos números: %d\n", Soma);


        scanner.close();
    }
}
