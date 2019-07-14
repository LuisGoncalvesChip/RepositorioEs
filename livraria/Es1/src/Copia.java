public class Copia {
    private int id;
    private Livro livro;

    public Copia(int id, Livro livro) {
        this.id = id;
        this.livro = livro;
    }

    public int getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
