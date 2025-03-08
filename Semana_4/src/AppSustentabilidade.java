import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class AppSustentabilidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<MonitoramentoResiduos> listaResiduos = new ArrayList<>();
        ArrayList<AreaVerde> listaAreas = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n------ Sistema Área Verde -------");
            System.out.println("1. Cadastrar área");
            System.out.println("2. Exibir áreas");
            System.out.println("3. Monitorar resíduos");
            System.out.println("4. Exibir resíduos");
            System.out.println("5. Resíduos por mês");
            System.out.println("6. Sair");
            System.out.print("O que deseja fazer? ");

            if (!scanner.hasNextInt()) {
                System.out.println("Opção inválida! Digite um número entre 1 e 6.");
                scanner.next();
                continue;
            }

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArea(scanner, listaAreas);
                    break;
                case 2:
                    exibirAreas(listaAreas);
                    break;
                case 3:
                    monitorarResiduos(scanner, listaResiduos, formatter);
                    break;
                case 4:
                    exibirResiduos(listaResiduos);
                    break;
                case 5:
                    System.out.println("Opção 5 selecionada: Resíduos por mês.");
                    int totalResiduos = MonitoramentoResiduos.calcularResiduosPorMes(listaResiduos);
                    System.out.println("Total de resíduos cadastrados neste mês: " + totalResiduos);
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida! Digite um número entre 1 e 6.");
            }
        }

        scanner.close();
        System.out.println("Sistema encerrado.");
    }

    public static void cadastrarArea(Scanner scanner, ArrayList<AreaVerde> listaAreas) {
        boolean continuarCadastro = true;
        while (continuarCadastro) {
            System.out.println("\n--- Cadastro de Área ---");

            System.out.print("Digite o nome da área: ");
            String nomeArea = scanner.nextLine();

            System.out.print("Digite a localização (bairro): ");
            String localizacao = scanner.nextLine();

            System.out.print("Digite o tamanho em metros quadrados: ");
            double tamanho = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Digite o status da conservação: ");
            String status = scanner.nextLine();

            System.out.print("Digite o responsável da área: ");
            String responsavel = scanner.nextLine();

            AreaVerde area = new AreaVerde(nomeArea, localizacao, tamanho, status, responsavel);
            area.calcularTamanhoEmHectares();
            listaAreas.add(area);

            System.out.println("\nÁrea cadastrada com sucesso!");
            System.out.println(area.exibirInformacoes());

            System.out.print("\nDeseja adicionar outra área? (S/N): ");
            String resposta = scanner.nextLine().trim().toUpperCase();

            if (resposta.equals("N")) {
                continuarCadastro = false;
            }
        }
    }

    public static void exibirAreas(ArrayList<AreaVerde> listaAreas) {
        if (listaAreas.isEmpty()) {
            System.out.println("\nNenhuma área cadastrada.");
        } else {
            System.out.println("\n--- Áreas Cadastradas ---");
            for (AreaVerde area : listaAreas) {
                System.out.println(area.exibirInformacoes());
                System.out.println("----------------------");
            }
        }
    }

    public static void monitorarResiduos(Scanner scanner, ArrayList<MonitoramentoResiduos> listaResiduos, DateTimeFormatter formatter) {
        boolean continuarCadastro = true;
        while (continuarCadastro) {
            System.out.println("\n--- Cadastro de Resíduo ---");

            System.out.print("Digite o tipo de resíduo: ");
            String tipoResiduo = scanner.nextLine();

            System.out.print("Digite a quantidade: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();

            LocalDate data = null;
            boolean dataValida = false;

            while (!dataValida) {
                try {
                    System.out.print("Digite a data no formato dd/MM/yyyy: ");
                    String dataInput = scanner.nextLine();
                    data = LocalDate.parse(dataInput, formatter);
                    dataValida = true;
                } catch (DateTimeParseException e) {
                    System.out.println("Formato de data inválido. Tente novamente.");
                }
            }

            System.out.print("Digite o status da coleta: ");
            String statusColeta = scanner.nextLine();

            System.out.print("Digite o responsável pela coleta: ");
            String responsavelColeta = scanner.nextLine();

            MonitoramentoResiduos residuo = new MonitoramentoResiduos(tipoResiduo, quantidade, data, statusColeta, responsavelColeta);
            listaResiduos.add(residuo);

            System.out.println("\nResíduo cadastrado com sucesso!");

            System.out.print("\nDeseja adicionar outro resíduo? (S/N): ");
            String resposta = scanner.nextLine().trim().toUpperCase();

            if (resposta.equals("N")) {
                continuarCadastro = false;
            }
        }
    }

    public static void exibirResiduos(ArrayList<MonitoramentoResiduos> listaResiduos) {
        if (listaResiduos.isEmpty()) {
            System.out.println("\nNenhum resíduo cadastrado.");
        } else {
            System.out.println("\n--- Resíduos Cadastrados ---");
            for (MonitoramentoResiduos residuo : listaResiduos) {
                System.out.println(residuo.exibirInformacoes());
                System.out.println("----------------------");
            }
        }
    }

}