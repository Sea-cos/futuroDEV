import java.util.Scanner;

/*
Leia um valor de ponto flutuante de dupla precisão (double) a partir do console e adicione-o a uma variável raio.
Em seguida, faça o cálculo da área de uma circunferência, cuja fórmula é a seguinte:  area = π . raio²
Considere o valor de π = 3.14159.
Por fim, imprima o valor de area com o seguinte formato:
Exemplo de saída: A = 12.3
 */

public class AreaCirculo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final double pi = 3.14159;

        System.out.println("--- Calculo de área de um círculo. ---");
        System.out.print("Digite o valor do raio: ");
        double raio = scan.nextDouble();

        double area = pi * (Math.pow(raio, 2));

        System.out.println("A aréa desse raio é: " + area);

    }
}
