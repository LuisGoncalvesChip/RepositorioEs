import java.time.LocalDate;

public class Coima {
    String descricao;
    float valor;
    Devolucao devolucao;
    AcessoAntecipado acessoAntecipado;
    EntradaNovoLivro entradaNovoLivro;

    public Coima(String descricao, float valor, Devolucao devolucao, AcessoAntecipado acessoAntecipado , EntradaNovoLivro entradaNovoLivro) {
        this.descricao = descricao;
        this.valor = valor;
        this.devolucao = devolucao;
        this.acessoAntecipado =acessoAntecipado;
        this.entradaNovoLivro = entradaNovoLivro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
       if( entradaNovoLivro.getData().isBefore(acessoAntecipado.Get_Data_Antecipada())) {
           return valor+7;}
       return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Devolucao getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Devolucao devolucao) {
        this.devolucao = devolucao;
    }
}
