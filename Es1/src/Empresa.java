public class Empresa {
    String nome;
    String TipoServico;

    public Empresa(String nome, String tipoServico) {
        this.nome = nome;
        TipoServico = tipoServico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoServico() {
        return TipoServico;
    }

    public void setTipoServico(String tipoServico) {
        TipoServico = tipoServico;
    }
}
