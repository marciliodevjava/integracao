package br.com.teste.Integracao.resource;

import br.com.teste.Integracao.IntegracaoService;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/integracao")
public class IntegracaoResource {

    @Autowired
    private IntegracaoService integracaoService;


    @PutMapping("/{id}")
    public ResponseEntity<?> integracao(@PathVariable Long id){
        integracaoService.atualizaPagamento(id);
        return ResponseEntity.ok("Pagamento confirmado ID:" + id);
    }
}
