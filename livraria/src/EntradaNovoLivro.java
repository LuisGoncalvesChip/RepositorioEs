import java.time.LocalDate;

public class EntradaNovoLivro {
    LocalDate data;
    Encomenda encomenda;
    Copia copia;

    public EntradaNovoLivro(LocalDate data, Encomenda encomenda, Copia copia) {
        this.data = data;
        this.encomenda = encomenda;
        this.copia = copia;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        this.encomenda = encomenda;
    }

    public Copia getCopia() {
        return copia;
    }

    public void setCopia(Copia copia) {
        this.copia = copia;
    }
}

