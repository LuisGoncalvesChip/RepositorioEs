import java.time.LocalDate;
import java.time.temporal.TemporalAmount;

public class AcessoAntecipado {


    EntradaNovoLivro entradaNovoLivro ;
    LocalDate Data_Antecipada ;

    public AcessoAntecipado(LocalDate Data_Antecipada ,EntradaNovoLivro entradaNovoLivro) {
         this.Data_Antecipada = Data_Antecipada;
         this.entradaNovoLivro = entradaNovoLivro;
    }


    public LocalDate Get_Data_Antecipada() {
        return  entradaNovoLivro.getData().plusDays(7)  ;
    }

    public void setEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) {
        this.entradaNovoLivro = entradaNovoLivro;
    }

    public void setData_Antecipada(LocalDate data_Antecipada) {
        Data_Antecipada = data_Antecipada;
    }
}
