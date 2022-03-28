import java.util.Scanner;

public class execicio02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double salarioBruto, prestacao, limite;

        System.out.println("Digite o valor do salario bruto:");
        salarioBruto = teclado.nextDouble();

        System.out.println("Digite o valor da prestação");
        prestacao = teclado.nextDouble();

        limite = salarioBruto * 0.30;

        if(salarioBruto <= limite){
            System.out.println("Você pode fazer emprestimo!");
        } else {
            System.out.println("Você não pode fazer emprestimo! Sua prestão não pode ser: "+prestacao);
        }
        teclado.close();
        
    }
}
