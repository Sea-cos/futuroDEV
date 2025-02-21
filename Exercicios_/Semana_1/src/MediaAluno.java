import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Media de notas ---");
        System.out.print("Insira a primeira nota: ");
        double A = scanner.nextDouble();
        System.out.print("Insira a segunda nota: ");
        double B = scanner.nextDouble();
        double media = (A * 3.5 + B * 7.5) / 11;

        System.out.printf("Considerando as notas %.2f e %.2f, a média do aluno foi %.2f\n", A, B, media);

        scanner.close();
    }
}