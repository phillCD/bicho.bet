package com.bicho.bet.bicho.bet.apostador;

import com.bicho.bet.bicho.bet.aposta.ApostaRepository;
import com.bicho.bet.bicho.bet.core.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

public class ApostadorService extends BaseService<Apostador, Long> {
    @Autowired
    private ApostaRepository apostaRepository;

    @Autowired
    private ApostadorRepository repository;

    @Override
    public ApostadorRepository getRepository() {
        return repository;
    }

//    public Double sacar(Double valorSaque) throws SaqueInvalidoException {
//        double valorSaldo = repository.getSaldo();
//        double valorAposta = apostaRepository.getValor();
//        if (valorSaque < valorAposta*3.00 || valorSaque > valorSaldo){
//            throw new SaqueInvalidoException();
//        }
//        repository.setSaldo(valorSaldo - valorSaque);
//        return valorSaque;
//    }
}
