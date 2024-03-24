import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% 
         *e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que 
         *calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a 
         * população do país B, mantidas as taxas de crescimento.
         * 
        */
        
        int Populacao_a=80000,Populacao_b=200000,Anos_Necessarios=0;
        
        double Taxa_Crecimento_a=0.03,Taxa_Crecimento_b=0.015;


        // Enquanto a população de A for menor que a população de B atualiza as populações de acordo com as taxas de crescimento
        while (Populacao_a < Populacao_b) {

            Populacao_a += Populacao_a * Taxa_Crecimento_a;
            Populacao_b += Populacao_b * Taxa_Crecimento_b;
            
            Anos_Necessarios++;
        }

        System.out.printf("Quantidade de Anos necessarios: %d",Anos_Necessarios);


        
        scanner.close();
    }
}
