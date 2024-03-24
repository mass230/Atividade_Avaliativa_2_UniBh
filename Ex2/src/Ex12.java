import java.util.Scanner;

public class Ex12 {
    

    public static void main(String[] args) {
    

        Scanner scanner = new Scanner(System.in);
    
        /*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
         *O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:*/

         int Gerador_Tabuada=0;
         int Resultado=0;


         System.out.print("Digite o numero que você deseja obter a tabuada: ");
         Gerador_Tabuada= scanner.nextInt();

         

            if (Gerador_Tabuada == 0) {
                for (int i = 1; i <= 10; i++) {
                    Resultado = Gerador_Tabuada * i;
                    System.out.printf("%d x %d = %d\n", Gerador_Tabuada, i, Resultado);
                }



                scanner.close();
            }

            if (Gerador_Tabuada == 1) {
                for (int i = 1; i <= 10; i++) {
                    Resultado = Gerador_Tabuada * i;
                    System.out.printf("%d x %d = %d\n", Gerador_Tabuada, i, Resultado);
                }



                scanner.close();
            }

            if (Gerador_Tabuada == 2) {
                for (int i = 1; i <= 10; i++) {
                    Resultado = Gerador_Tabuada * i;
                    System.out.printf("%d x %d = %d\n", Gerador_Tabuada, i, Resultado);
                }



                scanner.close();
            }

            if (Gerador_Tabuada == 3) {
                for (int i = 1; i <= 10; i++) {
                    Resultado = Gerador_Tabuada * i;
                    System.out.printf("%d x %d = %d\n", Gerador_Tabuada, i, Resultado);
                }



                scanner.close();
            }

            if (Gerador_Tabuada == 4) {
                for (int i = 1; i <= 10; i++) {
                    Resultado = Gerador_Tabuada * i;
                    System.out.printf("%d x %d = %d\n", Gerador_Tabuada, i, Resultado);
                }



                scanner.close();
            }

            if (Gerador_Tabuada == 5) {
                for (int i = 1; i <= 10; i++) {
                    Resultado = Gerador_Tabuada * i;
                    System.out.printf("%d x %d = %d\n", Gerador_Tabuada, i, Resultado);
                }



                scanner.close();
            }

            if (Gerador_Tabuada == 6) {
                for (int i = 1; i <= 10; i++) {
                    Resultado = Gerador_Tabuada * i;
                    System.out.printf("%d x %d = %d\n", Gerador_Tabuada, i, Resultado);
                }



                scanner.close();
            }

            if (Gerador_Tabuada == 7) {
                for (int i = 1; i <= 10; i++) {
                    Resultado = Gerador_Tabuada * i;
                    System.out.printf("%d x %d = %d\n", Gerador_Tabuada, i, Resultado);
                }



                scanner.close();
            }

            if (Gerador_Tabuada == 8) {
                for (int i = 1; i <= 10; i++) {
                    Resultado = Gerador_Tabuada * i;
                    System.out.printf("%d x %d = %d\n", Gerador_Tabuada, i, Resultado);
                }



                scanner.close();
            }

            if (Gerador_Tabuada == 9) {
                for (int i = 1; i <= 10; i++) {
                    Resultado = Gerador_Tabuada * i;
                    System.out.printf("%d x %d = %d\n", Gerador_Tabuada, i, Resultado);
                }



                scanner.close();
            }

            if (Gerador_Tabuada == 10) {
                for (int i = 1; i <= 10; i++) {
                    Resultado = Gerador_Tabuada * i;
                    System.out.printf("%d x %d = %d\n", Gerador_Tabuada, i, Resultado);
                }



                scanner.close();
            }else{
                System.err.println("Numero digitado está fora do escopo, que é de 0 a 10!!");
            }



    }
}
