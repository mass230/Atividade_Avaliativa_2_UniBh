import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        /*A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
         *Faça um programa capaz de gerar a série até o n−ésimo termo.*/

        int Primeiro_Termo=1, Segundo_Termo=1,Proximo_Termo=0, n=0;

        System.out.print("Digite o valor de n: ");
        n = scanner.nextInt();

        System.out.println("Série de fibonacci até o n_ésimo");

        for(int i= 1; i <= n; i++){

            System.out.printf("%d\n",Primeiro_Termo);

            Proximo_Termo = Primeiro_Termo + Segundo_Termo;
            Primeiro_Termo = Segundo_Termo;
            Segundo_Termo = Proximo_Termo;
        }




        scanner.close();
    }
    
}
