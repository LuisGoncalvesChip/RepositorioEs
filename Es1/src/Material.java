public class Material {
    String Nome;
    TipoMaterial tipo;

    public Material(String nome, TipoMaterial tipo) {
        Nome = nome;
        this.tipo = tipo;
    }


    public String getNome() {
        return Nome;
    }

    public TipoMaterial getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setTipo(TipoMaterial tipo) {
        this.tipo = tipo;
    }
}
