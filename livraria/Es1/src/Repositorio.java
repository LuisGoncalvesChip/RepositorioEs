public interface Repositorio{
/*Repositório inicial*/
        void adicionaUtilizador(Utilizador utilizador);
        void adicionaTipoUtilizador(TipoUtilizador tipo);
        void adicionaRequisicao(Requisicao requisicao);
        void adicionaCopia(Copia copia);
        void adicionaLivro(Livro livro);
        void adicionaEmprestimo(Emprestimo emprestimo);
        void adicionaNotificacao(Notificacao notificacao);
        void adicionaDevolucao(Devolucao devolucao);
        void adicionaCoima(Coima coima);
        Emprestimo devolveEmprestimoDaRequisicao(Requisicao r);
        void	adicionaEncomenda(Encomenda encomenda);
        void	adicionaEntradaNovoLivro(EntradaNovoLivro entradaNovoLivro);
        void	adicionaPropostaRequisicao(PropostaAquisicao proposta);
        void	adicionaRequisicaoCompra(RequisicaoCompra requisicaoCompra);

/*Novas Funcionalidades*/

        void adicionaTipoFuncionario(TipoFuncionario tipoFuncionario);
        void adicionaFuncionario(Funcionario funcionario);
        void adicionaSala(Sala sala);
        void adicionaAutor(Autor autor);
        void adicionaEvento(Evento evento);
        void adicionaAluguerSala(AluguerSala aluguer);

        void adicionaTipoMaterial(TipoMaterial tipoMaterial);
        void adicionaMaterial(Material material);
        void adicionaEmpresa(Empresa empresa);
        void adicionaPedidoManutencao(PedidoManutencao pedidoManutencao);
        void adicionaManutencao(Manutencao manutencao);


}
