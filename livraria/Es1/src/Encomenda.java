import java.time.LocalDate;

public class Encomenda {
    private LocalDate data;
    private RequisicaoCompra requisicao;

    public Encomenda(LocalDate data, RequisicaoCompra requisicao, Copia copia) {
        this.data = data;
        this.requisicao = requisicao;
    }

    public LocalDate getData() {
        return data;
    }

    public RequisicaoCompra getRequisicao() {
        return requisicao;
    }


    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setRequisicao(RequisicaoCompra requisicao) {
        this.requisicao = requisicao;
    }
}