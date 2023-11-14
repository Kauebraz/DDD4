package com.example.porto.model.bo;

import com.example.porto.model.vo.Apolice;
import com.example.porto.model.dao.ApoliceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Classe de camada BO que consiste na regra de negócio da classe Apolice
 */
@Component
public class ApoliceBO {

    @Autowired
    private ApoliceRepository apoliceRepository;

    @Autowired
    public ApoliceBO(ApoliceRepository apoliceRepository) {
        this.apoliceRepository = apoliceRepository;
    }

    /**
     * Valida a unicidade do número de apólice.
     *
     * @param apolice Objeto Apolice a ser validado.
     * @throws RuntimeException Se o número de apólice estiver duplicado.
     */
    public void validateNumeroApoliceUnique(Apolice apolice) {
        try {
            Apolice existingApolice = apoliceRepository.findByNumeroApolice(apolice.getNumero_apolice());
            if (existingApolice != null && !existingApolice.getId_apolice().equals(apolice.getId_apolice())) {
                throw new RuntimeException("Número de Apólice duplicado");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao verificar duplicidade de Número de Apólice", e);
        }
    }
}
