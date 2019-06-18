import java.util.ArrayList;

public class RepositorioMem implements Repositorio {

    private ArrayList<Coima> l_coima;
    private ArrayList<Copia> l_copia;
    private ArrayList<Devolucao> l_devolucao;
    private ArrayList<Emprestimo> l_emprestimo;
    private ArrayList<Encomenda> l_encomenda;
    private ArrayList<EntradaNovoLivro> l_enlivro;
    private ArrayList<Livro> l_livro;
    private ArrayList<Notificacao> l_notificacao;
    private ArrayList<PropostaAquisicao> l_proposta;
    private ArrayList<Requisicao> l_requisicao;
    private ArrayList<RequisicaoCompra> l_reqcompra;
    private ArrayList<TipoUtilizador> l_tipo;
    private ArrayList<Utilizador> l_utilizador;
    private ArrayList<Eventos> l_eventos;
    private ArrayList<PessoaEvento> l_pessoaEvento;


    public RepositorioMem() {
        l_coima = new ArrayList<Coima>();
        l_copia = new ArrayList<Copia>();
        l_devolucao = new ArrayList<Devolucao>();
        l_emprestimo = new ArrayList<Emprestimo>();
        l_encomenda = new ArrayList<Encomenda>();
        l_enlivro = new ArrayList<EntradaNovoLivro>();
        l_livro = new ArrayList<Livro>();
        l_notificacao = new ArrayList<Notificacao>();
        l_proposta = new ArrayList<PropostaAquisicao>();
        l_requisicao = new ArrayList<Requisicao>();
        l_reqcompra = new ArrayList<RequisicaoCompra>();
        l_tipo = new ArrayList<TipoUtilizador>();
        l_utilizador = new ArrayList<Utilizador>();
        l_eventos = new ArrayList<Eventos>();
        l_pessoaEvento = new ArrayList<PessoaEvento>();

    }



    void adicionaCoima(Coima coima){ l_coima.add(coima);}
    void adicionaCopia(Copia copia){ l_copia.add(copia); }
    void	adicionaDevolucao(Devolucao devolucao){ l_devolucao.add(devolucao); }
    void	adicionaEmprestimo(Emprestimo emprestimo){l_emprestimo.add(emprestimo); }
    public void  adicionaEncomenda(Encomenda encomenda){l_encomenda.add(encomenda);}
    public void  adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro){l_enlivro.add(entradaNovoLivro);}
    void	adicionaLivro(Livro livro){l_livro.add(livro); }
    void	adicionaNotificacao(Notificacao notificacao){ l_notificacao.add(notificacao);}
    void adicionaPropostaRequisicao(PropostaAquisicao proposta){l_proposta.add(proposta);}
    void	adicionaRequisicao(Requisicao requisicao){ l_requisicao.add(requisicao);}
    void  adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra){l_reqcompra.add(requisicaoCompra);}
    void	adicionaTipoUtilizador(TipoUtilizador tipo){ l_tipo.add(tipo); }
    void	adicionaUtilizador(Utilizador utilizador){ l_utilizador.add(utilizador); }
    void	adicionaEventos(Eventos eventos){ l_eventos.add(eventos); }
    void	adicionaPessoaEvento(PessoaEvento Pevento){ l_pessoaEvento.add(Pevento); }

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r){
        for (Emprestimo e:l_emprestimo){
            if (e.getRequisicao()==r)
                return e;
        }
        return null;
    }

    public int devolveNcopias(){
        return l_copia.size();
    }



}
