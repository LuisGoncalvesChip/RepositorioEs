public class PessoaEvento {
    Eventos eventos ;
    Utilizador utilizador ;

    public PessoaEvento(Eventos eventos, Utilizador utilizador) {
        this.eventos = eventos;
        this.utilizador = utilizador;
    }

    public Eventos getEventos() {
        return eventos;
    }

    public void setEventos(Eventos eventos) {
        this.eventos = eventos;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }
}
