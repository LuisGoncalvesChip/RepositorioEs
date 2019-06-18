public class Autor {

    String nome;
    Livro l ;

    public Autor(String nome, Livro l) {
        this.nome = nome;
        this.l = l;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro getL() {
        return l;
    }

    public void setL(Livro l) {
        this.l = l;
    }
}
