import java.time.LocalDate;
import java.util.ArrayList;

public class main {

    private Repositorio repo;

    public static void main(String args[]){
        Utilizador u= new Utilizador("João", "Ativo", new TipoUtilizador("Aluno",5));
        PropostaAquisicao p = new PropostaAquisicao(LocalDate.now(), u, "Game of Trones");
        Livro l = new Livro("50 Sombras de Grey", "Vintage Books");
        Copia c = new Copia(1, l);
        RequisicaoCompraCopia rcc = new RequisicaoCompraCopia("pendente", LocalDate.now(), "Oficio",l,u);
        Encomenda encomenda = new Encomenda(LocalDate.now(), rcc, c);
        EntradaNovoLivro entradaNovoLivro = new EntradaNovoLivro(LocalDate.now(),encomenda,c);

        /*Novas Classes*/
        //

        TipoFuncionario tf = new TipoFuncionario("Secretaria");
        Funcionario f =new Funcionario("Marcelo", tf);

        Empresa empresa = new Empresa("Carpintaria Silva", "carpintaria");


        Material m= new Material("cadeira xpto", new TipoMaterial("cadeiras"));
        
        PedidoManutencao pmanutencao = new PedidoManutencao(LocalDate.now(), f , m ,"pernas partidas", empresa);
        Manutencao manutencao= new Manutencao(LocalDate.now(), pmanutencao, 100);


        /* Alugar Sala */
        Sala s1 = new Sala(2,20);
        AluguerSala Asala =  new AluguerSala(s1,LocalDate.now(),20,f);


        /*criar evento */
        Autor A = new Autor("Panda",l);
        Evento ev = new Evento("Panda conta historias " ,A ,Asala);


        //... criação do objeto repositorio
        Repositorio repo = new RepositorioMem();
        repo.adicionaAluguerSala(Asala); // sala alugada
        repo.adicionaEvento(ev); // add evento
        repo.adicionaEntradaNovoLivro(entradaNovoLivro);
    }
}
