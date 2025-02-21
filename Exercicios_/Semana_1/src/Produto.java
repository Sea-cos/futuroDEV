import java.util.Scanner;

/*
Escreva um programa que lê dois valores inteiros e em seguida calcula o produto entre estes dois valores (multiplicação). Por fim, imprima a mensagem da seguinte forma:

PRODUTO = 27
 */


public class Produto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("--- Multiplicação de dois números ---");
        System.out.print("Insira o primeiro valor:");
        int n1 = scan.nextInt();
        System.out.print("Insira o segundo valor:");
        int n2 = scan.nextInt();

        double produto = n1 * n2;

        System.out.printf("O produto entre %d e %d é %.2f", n1, n2, produto);
    }
}
