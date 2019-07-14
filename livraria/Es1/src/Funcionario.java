public class Funcionario {
    String nome;
    TipoFuncionario tipo;


    public Funcionario(String nome, TipoFuncionario tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }


    public String getNome() {
        return nome;
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(TipoFuncionario tipo) {
        this.tipo = tipo;
    }
}
