import java.time.LocalDate;
import java.util.List;

public class MonitoramentoResiduos {

    //Atributos
    private String tipoResiduo;
    private int quantidade;
    private LocalDate date;
    private String statusColeta;
    private String responsavelColeta;

    //construtores

    MonitoramentoResiduos(){};

    public MonitoramentoResiduos(String tipoResiduo, int quantidade, LocalDate date, String statusColeta, String responsavelColeta) {
        this.tipoResiduo = tipoResiduo;
        this.quantidade = quantidade;
        this.date = date;
        this.statusColeta = statusColeta;
        this.responsavelColeta = responsavelColeta;
    }

    public MonitoramentoResiduos(String tipoResiduo, int quantidade, LocalDate date) {
        this.tipoResiduo = tipoResiduo;
        this.quantidade = quantidade;
        this.date = date;
    }
    //get e set

    public String getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo(String tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatusColeta() {
        return statusColeta;
    }

    public void setStatusColeta(String statusColeta) {
        this.statusColeta = statusColeta;
    }

    public String getResponsavelColeta() {
        return responsavelColeta;
    }

    public void setResponsavelColeta(String responsavelColeta) {
        this.responsavelColeta = responsavelColeta;
    }

    //métodos
    public String exibirInformacoes() {
        return String.format("--- Informações do residuo ---" +
                "\nResiduo: %s" +
                "\nQuantidade: %s" +
                "\nData: %s" +
                "\nStatus: %s" +
                "\nResponsavel: %s", tipoResiduo, quantidade, date.toString(), statusColeta, responsavelColeta);

    }

    public static int calcularResiduosPorMes(List<MonitoramentoResiduos> listaResiduos) {
        if (listaResiduos.isEmpty()) {
            System.out.println("\nNenhum resíduo cadastrado.");
            return 0;
        }

        int residuosNoMes = 0;
        LocalDate hoje = LocalDate.now();

        for (MonitoramentoResiduos residuo : listaResiduos) {
            if (residuo.getDate().getMonth() == hoje.getMonth() && residuo.getDate().getYear() == hoje.getYear()) {
                residuosNoMes += residuo.getQuantidade();
            }
        }

        return residuosNoMes;
    }
}
