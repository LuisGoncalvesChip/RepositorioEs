

public class Utilizador extends Object{
	String nome;
	String estado;
	TipoUtilizador tipoUtilizador;
	
	
	public Utilizador(String nome_, String estado_ , TipoUtilizador tipoUtilizador_) {
		this.nome = nome_;
		this.estado = estado_;
		this.tipoUtilizador = tipoUtilizador_;
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

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setTipoUtilizador(TipoUtilizador tipoUtilizador) {
		this.tipoUtilizador = tipoUtilizador;
	}
}
