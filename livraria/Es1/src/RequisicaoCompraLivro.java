import java.time.LocalDate;

public class RequisicaoCompraLivro extends RequisicaoCompra {
    PropostaAquisicao propostaAquisicao;

    public RequisicaoCompraLivro(String estado, LocalDate data, String oficio, Livro livro, Utilizador utilizador, PropostaAquisicao propostaAquisicao) {
        super(estado, data, oficio, livro, utilizador);
        this.propostaAquisicao = propostaAquisicao;
    }

    public PropostaAquisicao getPropostaAquisicao() {
        return propostaAquisicao;
    }
}
