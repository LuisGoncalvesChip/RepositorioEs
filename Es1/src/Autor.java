public class Autor {
    String Nome;
    Livro livro;

    public Autor(String nome, Livro livro) {
        Nome = nome;
        this.livro = livro;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
