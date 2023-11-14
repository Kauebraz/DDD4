package com.example.porto.model.bo;

import com.example.porto.model.vo.Veiculo;
import com.example.porto.model.dao.VeiculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Classe de camada BO que consiste na regra de negócio da classe Veiculo
 */
@Component
public class VeiculoBO {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @Autowired
    public VeiculoBO(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    /**
     * Valida a unicidade da placa de veículo.
     *
     * @param veiculo Objeto Veiculo a ser validado.
     * @throws RuntimeException Se a placa de veículo estiver duplicada.
     */
    public void validatePlacaUnique(Veiculo veiculo) {
        try {
            Veiculo existingVeiculo = veiculoRepository.findByPlaca(veiculo.getPlaca_veiculo());
            if (existingVeiculo != null && !existingVeiculo.getId_veiculo().equals(veiculo.getId_veiculo())) {
                throw new RuntimeException("Placa de veículo duplicada");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao verificar duplicidade de Placa de veículo", e);
        }
    }
}
