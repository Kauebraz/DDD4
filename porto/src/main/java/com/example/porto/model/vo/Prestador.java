package com.example.porto.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Classe de prestador que criar os seus atributos com informações da seguradoria e os métodos getters e setters
 */
@Table(name="TB_PRESTADOR")
@Entity
public class Prestador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_prestador;
	private String nome_prestador;
	private int cnpj_prestador;
	/**
	 * @param id_prestador
	 * @param nome_prestador
	 * @param cnpj_prestador
	 */
	public Prestador(Long id_prestador, String nome_prestador, int cnpj_prestador) {
		super();
		this.id_prestador = id_prestador;
		this.nome_prestador = nome_prestador;
		this.cnpj_prestador = cnpj_prestador;
	}
	/**
	 * @return the id_prestador
	 */
	public Long getId_prestador() {
		return id_prestador;
	}
	/**
	 * @param id_prestador the id_prestador to set
	 */
	public void setId_prestador(Long id_prestador) {
		this.id_prestador = id_prestador;
	}
	/**
	 * @return the nome_prestador
	 */
	public String getNome_prestador() {
		return nome_prestador;
	}
	/**
	 * @param nome_prestador the nome_prestador to set
	 */
	public void setNome_prestador(String nome_prestador) {
		this.nome_prestador = nome_prestador;
	}
	/**
	 * @return the cnpj_prestador
	 */
	public int getCnpj_prestador() {
		return cnpj_prestador;
	}
	/**
	 * @param cnpj_prestador the cnpj_prestador to set
	 */
	public void setCnpj_prestador(int cnpj_prestador) {
		this.cnpj_prestador = cnpj_prestador;
	}
	
	
}
