package br.com.schoolbit.cidademelhor.bairro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BairroService {

    @Autowired
    private BairroRepository bairroRepository;

    public String salvar(BairroModel bairroModel) {

        bairroRepository.save(bairroModel);

        return "Bairro salvo com sucesso";
    }

    public List<BairroModel> buscarTodos() {
        return bairroRepository.findAll();
    }
}
