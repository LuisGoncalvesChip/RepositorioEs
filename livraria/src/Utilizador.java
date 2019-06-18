

public class Utilizador extends Object{
	String nome;
	String estado;
	TipoUtilizador tipoUtilizador;
	
	
	public Utilizador(String nome_, String estado_) {
		this.nome = nome_;
		this.estado = estado_;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public TipoUtilizador getTipoUtilizador() {
		return this.tipoUtilizador;
	}
}
