import java.time.LocalDate;

public class Manutencao {
    LocalDate datamanutencao;
    PedidoManutencao pedido;
    Integer valor;

    public Manutencao(LocalDate datamanutencao, PedidoManutencao pedido, Integer valor) {
        this.datamanutencao = datamanutencao;
        this.pedido = pedido;
        this.valor = valor;
    }


    public LocalDate getDatamanutencao() {
        return datamanutencao;
    }

    public void setDatamanutencao(LocalDate datamanutencao) {
        this.datamanutencao = datamanutencao;
    }

    public PedidoManutencao getPedido() {
        return pedido;
    }

    public void setPedido(PedidoManutencao pedido) {
        this.pedido = pedido;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
}
