public class Evento {
    String Nome;
    Autor autor;
    AluguerSala aluguerSala;

    public Evento(String nome, Autor autor, AluguerSala aluguerSala) {
        Nome = nome;
        this.autor = autor;
        this.aluguerSala = aluguerSala;
    }


    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public AluguerSala getAluguerSala() {
        return aluguerSala;
    }

    public void setAluguerSala(AluguerSala aluguerSala) {
        this.aluguerSala = aluguerSala;
    }
}
