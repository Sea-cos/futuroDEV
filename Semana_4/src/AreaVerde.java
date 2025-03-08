public class AreaVerde {

    //Atributos
    private String nome;
    private String localizacao;
    private double tamanho;
    private double tamanhoHectar;
    private String statusConservacao;
    private String responsavel;


    //construtor

    AreaVerde(){};

    public AreaVerde(String nome, String localizacao, double tamanho) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
    }

    public AreaVerde(String nome, String localizacao, double tamanho, String statusConservacao, String responsavel) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.tamanho = tamanho;
        this.statusConservacao = statusConservacao;
        this.responsavel = responsavel;
    }

    //get e set


    public double getTamanhoHectar() {
        return tamanhoHectar;
    }

    public void setTamanhoHectar(double tamanhoHectar) {
        this.tamanhoHectar = tamanhoHectar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getStatusConservacao() {
        return statusConservacao;
    }

    public void setStatusConservacao(String statusConservacao) {
        this.statusConservacao = statusConservacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }


    //metodos

    public String exibirInformacoes(){
        return String.format("--- Informações da área ---" +
                "\nNome: %s" +
                "\nLocalização: %s" +
                "\nTamanho em hectares: %f" +
                "\nStatus: %s" +
                "\nResponsavel: %s", nome, localizacao, tamanhoHectar, statusConservacao, responsavel);
    }

    public double calcularTamanhoEmHectares(){
        this.tamanhoHectar = this.tamanho / 10000;
        return this.tamanhoHectar;
    }
}
