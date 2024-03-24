import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        /*Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
        * Valide a entrada e permita repetir a operação.*/

        int Populacao_a=0,Populacao_b=0,Anos_Necessarios=0;
        
        double Taxa_Crecimento_a=0,Taxa_Crecimento_b=0;

        //Entrada de dados população A

        //System.out.print("Digite a população A: ");
        //Populacao_a = scanner.nextInt();

        do {
            System.out.print("Digite a população A: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Digite um valor válido para a população A: ");
                scanner.next();
            }
            Populacao_a = scanner.nextInt();
        } while (Populacao_a <= 0);




        //Entrada de dados população B



        //System.out.print("Digite a população B: ");
        //Populacao_b = scanner.nextInt();


        do {
            System.out.print("Digite a população B: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Digite um valor válido para a população do país B: ");
                scanner.next();
            }
            Populacao_b = scanner.nextInt();
        } while (Populacao_b <= 0);


        //Entrada de dados crecimento população A


        //System.out.print("Digite a taxa de crecimento da população A : ");
        //Taxa_Crecimento_a = scanner.nextDouble();


        do {
            System.out.print("*Digite o decimal com virgula* Digite a taxa de crecimento da população A : ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Digite um número válido para a taxa de crescimento do país A: ");
                scanner.next();
            }
            Taxa_Crecimento_a= scanner.nextDouble();
        } while (Taxa_Crecimento_a<= 0);


        //Entrada de dados crecimento população B

        
       // System.out.print("Digite a taxa de crecimento da população B: ");
       // Taxa_Crecimento_b = scanner.nextDouble();


       do {
        System.out.print("*Digite o decimal com virgula* Digite a taxa de crecimento da população B:");
        while (!scanner.hasNextDouble()) {
            System.out.print("Digite um número válido para a taxa de crescimento do país B: ");
            scanner.next();
        }
        Taxa_Crecimento_b= scanner.nextDouble();
    } while (Taxa_Crecimento_b<= 0);



        // Enquanto a população de A for menor que a população de B atualiza as populações de acordo com as taxas de crescimento
        while (Populacao_a < Populacao_b) {

            Populacao_a += Populacao_a * Taxa_Crecimento_a / 100;
            Populacao_b += Populacao_b * Taxa_Crecimento_b / 100;
            Anos_Necessarios++;
        }

        System.out.printf("Quantidade de Anos necessarios: %d",Anos_Necessarios);

    
    
    
        scanner.close();
    }
}
