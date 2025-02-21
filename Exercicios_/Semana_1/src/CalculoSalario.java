import java.util.Scanner;


public class CalculoSalario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Calculo de salário recebido ---");

        System.out.print("Insira o nome do funcionário: ");
        String nome = scan.next();
        System.out.print("Insira quantidade de horas trabalhadas: ");
        int horas = scan.nextInt();
        System.out.print("Insira o valor que recebe por hora: ");
        double valor_hora = scan.nextDouble();

        double total_recebido = horas * valor_hora;
        System.out.printf("O funcionário %s trabalhou %d horas e portanto, possui R$%.2f a receber.", nome, horas, total_recebido);
    }
}
