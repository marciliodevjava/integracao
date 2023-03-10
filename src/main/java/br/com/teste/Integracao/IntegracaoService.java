package br.com.teste.Integracao;

import br.com.teste.Integracao.http.PedidoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@Service
public class IntegracaoService {

    @Autowired
    private PedidoClient pedidoClient;
    public void atualizaPagamento(Long id) {
        pedidoClient.atualizaPagamaento(id);
    }
}
