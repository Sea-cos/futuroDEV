import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainExercicio4 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        AreaVerde area1 = new AreaVerde("Expoville", "Glória", 40000);
        MonitoramentoResiduos residuo1 = new MonitoramentoResiduos("Lixo", 10, LocalDate.parse("07/03/2025", formatter));

        System.out.println(area1.exibirInformacoes());
        System.out.println(residuo1.exibirInformacoes());

    }
}
