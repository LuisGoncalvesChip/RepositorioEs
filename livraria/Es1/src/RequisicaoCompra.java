import java.time.LocalDate;

public class RequisicaoCompra {

    String estado;
    LocalDate data;
    String oficio;
    Livro livro;
    Utilizador utilizador;


    public RequisicaoCompra(String estado, LocalDate data, String oficio, Livro livro, Utilizador utilizador) {
        this.estado = estado;
        this.data = data;
        this.oficio = oficio;
        this.livro = livro;
        this.utilizador = utilizador;
    }


    public String getEstado() {
        return estado;
    }

    public LocalDate getData() {
        return data;
    }

    public String getOficio() {
        return oficio;
    }

    public Livro getLivro() {
        return livro;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }
}
