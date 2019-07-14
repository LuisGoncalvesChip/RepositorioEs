import java.time.LocalDate;

public class Requisicao {
    private LocalDate data;
    private Utilizador utilizador;
    private Copia copia;

    public Requisicao(LocalDate data, Utilizador utilizador, Copia copia) {
        this.data = data;
        this.utilizador = utilizador;
        this.copia = copia;
    }


    public LocalDate getData() {
        return data;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public Copia getCopia() {
        return copia;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public void setCopia(Copia copia) {
        this.copia = copia;
    }
}
