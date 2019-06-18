

public class TipoUtilizador {
	String descricao;
	int prazoEmprestimo;
	
	public TipoUtilizador(String desc, int pEmp) {
		this.descricao = desc;
		this.prazoEmprestimo = pEmp;
	}
	
	public String getDescricao() { return this.descricao; }
	public int getPrazoEmprestimo() { return this.prazoEmprestimo; }
	
}
