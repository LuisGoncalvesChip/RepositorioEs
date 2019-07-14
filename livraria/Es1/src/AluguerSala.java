import java.time.LocalDate;

public class AluguerSala {
    Sala sala;
    LocalDate dataAluguer;
    Integer duracao;
    Funcionario funcionario;


    public AluguerSala(Sala sala, LocalDate dataAluguer, Integer duracao, Funcionario funcionario) {
        this.sala = sala;
        this.dataAluguer = dataAluguer;
        this.duracao = duracao;

        this.funcionario = funcionario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalDate getDataAluguer() {
        return dataAluguer;
    }

    public void setDataAluguer(LocalDate dataAluguer) {
        this.dataAluguer = dataAluguer;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }



    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
