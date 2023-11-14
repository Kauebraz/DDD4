package com.example.porto.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.porto.model.vo.Segurado;
/**
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Interface que pega o repositório JPA para servir como camada DAO e utiliza um findByCpfCnpj como validação de duplicidade de CPF/CNPJ
 */
public interface SeguradoRepository extends JpaRepository<Segurado, Long> {

    Segurado findByCpfCnpj(String cpfCnpj);

}

