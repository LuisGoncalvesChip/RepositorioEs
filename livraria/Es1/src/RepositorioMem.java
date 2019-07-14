import java.util.ArrayList;
import java.util.HashMap;

public class RepositorioMem implements Repositorio {

    private ArrayList<Coima> lcoima = new ArrayList<>();
    private ArrayList<Copia> lcopia = new ArrayList<>();
    private ArrayList<Devolucao> ldevolucao = new ArrayList<>();
    private HashMap<Requisicao, Emprestimo> hashmapemprestimo = new HashMap<>();
    private ArrayList<Livro> llivro = new ArrayList<>();
    private ArrayList<Notificacao> lnotificacao = new ArrayList<>();
    private ArrayList<Requisicao> lrequisicao = new ArrayList<>();
    private ArrayList<TipoUtilizador> ltipoUtilizador = new ArrayList<>();
    private ArrayList<Utilizador> lutilizador = new ArrayList<>();
    private ArrayList<EntradaNovoLivro> lentradaNovoLivro = new ArrayList<>();
    private ArrayList<Encomenda> lencomenda = new ArrayList<>();
    private ArrayList<RequisicaoCompra> lrequisicaoCompra = new ArrayList<>();
    private ArrayList<PropostaAquisicao> lpropostaAquisicao = new ArrayList<>();

    ///////////////////////////////////////////

    private ArrayList<TipoMaterial> ltipoMaterial = new ArrayList<>();
    private ArrayList<Material> lMaterial = new ArrayList<>();
    private ArrayList<TipoFuncionario> lTipoFuncionario = new ArrayList<>();
    private ArrayList<Funcionario> lFuncionario = new ArrayList<>();
    private ArrayList<Empresa> lempresa = new ArrayList<>();
    private ArrayList<Autor> lautor= new ArrayList<>();
    private ArrayList<Sala> lsala=new ArrayList<>();
    private ArrayList<Evento> levento=new ArrayList<>();
    private ArrayList<AluguerSala> laluguersala=new ArrayList<>();
    private ArrayList<PedidoManutencao> lpedidoManutencao = new ArrayList<>();
    private ArrayList<Manutencao> lManutencao = new ArrayList<>();




    public void adicionaUtilizador(Utilizador utilizador) {
    lutilizador.add(utilizador);
    }


    public void adicionaTipoUtilizador(TipoUtilizador tipo) {
    ltipoUtilizador.add(tipo);
    }


    public void adicionaRequisicao(Requisicao requisicao) {
    lrequisicao.add(requisicao);
    }


    public void adicionaCopia(Copia copia) {
    lcopia.add(copia);
    }


    public void adicionaLivro(Livro livro) {
    llivro.add(livro);
    }


    public void adicionaEmprestimo(Emprestimo emprestimo) {
    hashmapemprestimo.put(emprestimo.getRequisicao(), emprestimo);
    }


    public void adicionaNotificacao(Notificacao notificacao) {
    lnotificacao.add(notificacao);
    }


    public void adicionaDevolucao(Devolucao devolucao) {
    ldevolucao.add(devolucao);
    }


    public void adicionaCoima(Coima coima) {
    lcoima.add(coima);
    }


    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r) {
        return hashmapemprestimo.get(r);
    }


    public void adicionaEncomenda(Encomenda encomenda) {
    lencomenda.add(encomenda);
    }


    public void adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro) {
    lentradaNovoLivro.add(entradaNovoLivro);
    }


    public void adicionaPropostaRequisicao(PropostaAquisicao proposta) {
    lpropostaAquisicao.add(proposta);
    }


    public void adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra) {
    lrequisicaoCompra.add(requisicaoCompra);
    }


    //Novos Métodos


    public void adicionaTipoFuncionario(TipoFuncionario tipoFuncionario){lTipoFuncionario.add(tipoFuncionario);};
    public void adicionaFuncionario(Funcionario funcionario){lFuncionario.add(funcionario);};
    public void adicionaSala(Sala sala){lsala.add(sala);};
    public void adicionaAutor(Autor autor){lautor.add(autor);};
    public void adicionaEvento(Evento evento){levento.add(evento);};
    public void adicionaAluguerSala(AluguerSala aluguer){laluguersala.add(aluguer);};

    public void adicionaTipoMaterial(TipoMaterial tipoMaterial){ltipoMaterial.add(tipoMaterial);};
    public void adicionaMaterial(Material material){lMaterial.add(material);};
    public void adicionaEmpresa(Empresa empresa){lempresa.add(empresa);};
    public void adicionaPedidoManutencao(PedidoManutencao pedidoManutencao){lpedidoManutencao.add(pedidoManutencao);};
    public void adicionaManutencao(Manutencao manutencao){lManutencao.add(manutencao);};

}


