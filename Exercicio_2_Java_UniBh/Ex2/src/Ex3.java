import java.util.Scanner;


public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * Faça um programa que leia e valide as seguintes informações:
         *  Nome: maior que 3 caracteres;
         *  Idade: entre 0 e 150;
         *  Salário: maior que zero;
         *  Sexo: 'f' ou 'm';
         *  Estado Civil: 's', 'c', 'v', 'd';
         */




        int idade =0;
        String nome;
        float salario =0;
        char sexo;
        char Estado_Civil;
        int count =0;



        //Validação do nome


        System.out.print("Digite o nome: ");
        nome = scanner.next();

        
        //Conta quantidade de caracteres

        for(int i=0; i<nome.length(); i++){
            count++;
        }
        
        //System.out.printf("numero de caracteres é: %d", count);

        if (count<=3) {

            System.out.println("Nome menor que três caracteres, invalido!");
            
        }
        else if (count>3) {

            System.out.println("Nome valido");
            
        }


        //Validação de idade


        System.out.print("Digite o idade: ");
        idade = scanner.nextInt();

        //System.out.printf("Idade igual: %d",idade);

        if (idade<=0) {

            System.out.println("Idade invalida");

        }
        else if (idade>=150) {
            System.out.println("idade invalida");
        }
        else System.out.println("Idade valida");  



        //Validação de sexo


        System.out.print("Digite o sexo: ");
        sexo = scanner.next().charAt(0);
        
        //System.out.printf("sexo=%c",sexo);

        if (sexo== 'F') {

            System.out.println("Sexo valido");

        }
        else if (sexo == 'M') {
            System.out.println("Sexo valido");
        }
        else System.out.println("Sexo inavlido");




        //Validação de Estado Civil 's', 'c', 'v', 'd';


        System.out.print("Digite o Estado civil *Em letras maiusculas*: ");
        Estado_Civil = scanner.next().charAt(0);
        
        //System.out.printf("Estado civil=%c",Estado_Civil);

        if (Estado_Civil == 'S') {

            System.out.println("Estado civil valido");

        }
        else if (Estado_Civil == 'C') {
            System.out.println("Estado civil valido");
        }
        else if (Estado_Civil == 'V') {
            System.out.println("Estado civil valido");
        }
        else if (Estado_Civil == 'D') {
            System.out.println("Estado civil valido");
        }
        else System.out.println("Estado civil inavlido");


        //Validação de salario



        System.out.print("Digite o salario: ");
        salario = scanner.nextInt();

        //System.out.printf("Salario igual: %f",salario);

        if (salario<=0) {

            System.out.println("salario invalido");

        }
        else System.out.printf("Idade igual: %f",salario);
        




        scanner.close();

    }

    
}
