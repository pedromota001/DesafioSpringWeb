package br.com.pedromota.desafioSpringWeb.desafioSpringWeb.services;

import br.com.pedromota.desafioSpringWeb.desafioSpringWeb.dto.FraseDTO;
import br.com.pedromota.desafioSpringWeb.desafioSpringWeb.models.Frase;
import br.com.pedromota.desafioSpringWeb.desafioSpringWeb.repository.IFraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private IFraseRepository fraseRepository;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = fraseRepository.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
