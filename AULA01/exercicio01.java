import java.util.Scanner;

/**
 * exercicio01
 */
public class exercicio01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Double nota1,nota2,media;

        System.out.println("### Media de alunos ###");
        
        System.out.println("Digite a primeira nota do aluno: ");
        nota1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota do aluno: ");
        nota2 = teclado.nextDouble();

        media = (nota1 + nota2)/2;
        System.out.println("A média do aluno é: "+ media);

        teclado.close();
    }
}