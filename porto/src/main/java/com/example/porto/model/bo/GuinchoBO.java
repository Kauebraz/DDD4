package com.example.porto.model.bo;

import com.example.porto.model.vo.Guincho;
import com.example.porto.model.dao.GuinchoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Classe de camada BO que consiste na regra de negócio da classe Guincho
 */
@Component
public class GuinchoBO {

    @Autowired
    private GuinchoRepository guinchoRepository;

    @Autowired
    public GuinchoBO(GuinchoRepository guinchoRepository) {
        this.guinchoRepository = guinchoRepository;
    }

    /**
     * Valida a unicidade da placa modal de guincho.
     *
     * @param guincho Objeto Guincho a ser validado.
     * @throws RuntimeException Se a placa modal estiver duplicada.
     */
    public void validatePlacaModalUnique(Guincho guincho) {
        try {
            Guincho existingGuincho = guinchoRepository.findByPlacaModal(guincho.getPlaca_modal());
            if (existingGuincho != null && !existingGuincho.getId_guincho().equals(guincho.getId_guincho())) {
                throw new RuntimeException("Placa Modal de Guincho duplicada");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao verificar duplicidade de Placa Modal de Guincho", e);
        }
    }
}


