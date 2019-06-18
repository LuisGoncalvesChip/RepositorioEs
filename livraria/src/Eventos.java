import java.time.LocalDate;


public class Eventos {


       Utilizador u ;
       Sala s;
       Autor A ;

    public Eventos(Utilizador u, Sala s, Autor a) {
        this.u = u;
        this.s = s;
        A = a;
    }

    public Utilizador getU() {
        return u;
    }

    public void setU(Utilizador u) {
        this.u = u;
    }

    public Sala getS() {
        return s;
    }

    public void setS(Sala s) {
        this.s = s;
    }

    public Autor getA() {
        return A;
    }

    public void setA(Autor a) {
        A = a;
    }
}
