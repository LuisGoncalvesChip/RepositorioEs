import java.time.LocalDate;

public class PedidoManutencao {
    LocalDate datapedido;
    Funcionario funcionario;
    Material material;
    String motivo;
    Empresa empresa;

    public PedidoManutencao(LocalDate datapedido, Funcionario funcionario, Material material, String motivo, Empresa empresa) {
        this.datapedido = datapedido;
        this.funcionario = funcionario;
        this.material = material;
        this.motivo = motivo;
        this.empresa = empresa;
    }

    public LocalDate getDatapedido() {
        return datapedido;
    }

    public void setDatapedido(LocalDate datapedido) {
        this.datapedido = datapedido;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
