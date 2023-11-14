package com.example.porto.model.bo;

import com.example.porto.model.vo.Segurado;
import com.example.porto.model.dao.SeguradoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Classe de camada BO que consiste na regra de negócio da classe Segurado.
 * Essa classe é responsável por implementar as regras de negócio relacionadas aos Segurados.
 *
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Segurado
 * @see SeguradoRepository
 */
@Component
public class SeguradoBO {

    @Autowired
    private SeguradoRepository seguradoRepository;

    /**
     * Construtor da classe SeguradoBO.
     *
     * @param seguradoRepository Repositório de dados para a entidade Segurado.
     */
    @Autowired
    public SeguradoBO(SeguradoRepository seguradoRepository) {
        this.seguradoRepository = seguradoRepository;
    }

    /**
     * Valida a unicidade do CPF/CNPJ para um Segurado.
     *
     * @param segurado Objeto Segurado a ser validado.
     * @throws RuntimeException Se o CPF/CNPJ estiver duplicado.
     */
    public void validateCpfCnpjUnique(Segurado segurado) {
        try {
            Segurado existingSegurado = seguradoRepository.findByCpfCnpj(segurado.getcpfCnpj());
            if (existingSegurado != null && !existingSegurado.getId_segurado().equals(segurado.getId_segurado())) {
                throw new RuntimeException("CPF/CNPJ duplicado");
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao verificar duplicidade de CPF/CNPJ", e);
        }
    }
}


