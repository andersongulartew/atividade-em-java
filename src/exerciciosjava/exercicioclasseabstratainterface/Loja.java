package exerciciosjava.exercicioclasseabstratainterface;

public abstract class Loja {

    private String idenficador;
    private String cnpj;
    private String razaoSocial;
    private boolean aberta;

    public Loja(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public abstract String exibirDetalhes();

    public String getIformacoes() {
    String status = aberta?"Aberta":"Fechada";
    return "Razão Social: " + razaoSocial + "\nCNPJ: " + cnpj + "\nStatus: " + status;
    }



}
