
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        //Escreva um programa que leia vários números inteiros digitados pelo usuário, até que o usuário digite zero. 
        //O zero termina o programa e exibe a soma de todos os valores digitados. 
        Scanner teclado = new Scanner(System.in);

        int numero, soma;
        numero = 1;
        soma = 0;

        while(numero!=0){
            System.out.println("Digite um número inteiro: ");
            numero = teclado.nextInt();
            soma = soma + numero;
        }
        System.out.println("soma = "+ soma);
        teclado.close();        
    }
}
