import java.time.LocalDate;

public class EdicaoLimitada {


    RepositorioMem r ;
    Copia c;

    public EdicaoLimitada(RepositorioMem r , Copia c) {
        this.r = r;
        this.c=c ;
    }

    public String Get_EdicaoLimitada(Copia c) {

        if (r.devolveNcopias() <= 5)
            return "Edicao limitada de id "+ c.getLivro();
        return "Nao e edicao limitada de id "+c.getLivro();

    }

    public String Set_EdicaoLimitada(Copia c) {

        if (r.devolveNcopias() <= 5)
        return "Edicao limitada de id "+ c.getLivro();
     return "Nao e edicao limitada de id "+c.getLivro();

    }


}
