package exerciciosjava.exercicioclasseabstratainterface;


public class LojaShopping extends Loja implements Registro {
    private String endereco;
    private String gerente;

    public LojaShopping(String cnpj, String razaoSocial, String endereco, String gerente) {
        super(cnpj, razaoSocial);
        this.endereco = endereco;
        this.gerente = gerente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String exibirDetalhes() {
        return "Endereco Loja : " + endereco + ",\nGerente : " + gerente + "\nCNPJ : " + getCnpj() + "\nRazão Social :" + getRazaoSocial();
    }


    @Override
    public void registra_abertura_dia(){
        if(isAberta()){
            setAberta(true);
            System.out.println("A Loja foi Aberta");
        }else {
            System.out.println("A Loja já esta Aberta");
        }
    }

    @Override
    public void registra_fechamento_dia(){
        if(isAberta()){
            setAberta(false);
            System.out.println("A Loja foi Fechada");
        }else {
            System.out.println("A loja já esta Fechada");
        }
    }

}
