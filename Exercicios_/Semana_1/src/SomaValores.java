import java.util.Scanner;

public class SomaValores {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1, n2;

        System.out.println("--- Somatória de dois números ---");
        System.out.print("Digite o primeiro numéro: ");
        n1 = scan.nextInt();
        System.out.println();

        System.out.print("Digite o segundo número: ");
        n2 = scan.nextInt();
        System.out.println();

        int soma = n1 + n2;

        System.out.format("A soma entre %d e %d é %d",n1, n2, soma);
    }
}
