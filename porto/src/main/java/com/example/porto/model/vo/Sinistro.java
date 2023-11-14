package com.example.porto.model.vo;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Classe de sinistro que cria os seus atributos com informações sobre o acidente/problema e os métodos getters e setters
 */
@Table(name="TB_SINISTRO")
@Entity
public class Sinistro{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_sinistro;
	private Timestamp data_hora_sinistro;
	private String endereco_sinistro;
	private String tipo_ocorrencia_sinistro;
	
	public Sinistro() {
		
	}
	
	/**
	 * @param id_sinistro
	 * @param data_hora_sinistro
	 * @param endereco_sinistro
	 * @param tipo_ocorrencia_sinistro
	 */
	public Sinistro(Long id_sinistro, Timestamp data_hora_sinistro, String endereco_sinistro,
			String tipo_ocorrencia_sinistro) {
		super();
		this.id_sinistro = id_sinistro;
		this.data_hora_sinistro = data_hora_sinistro;
		this.endereco_sinistro = endereco_sinistro;
		this.tipo_ocorrencia_sinistro = tipo_ocorrencia_sinistro;
	}
	/**
	 * @return the id_sinistro
	 */
	public Long getId_sinistro() {
		return id_sinistro;
	}
	/**
	 * @param id_sinistro the id_sinistro to set
	 */
	public void setId_sinistro(Long id_sinistro) {
		this.id_sinistro = id_sinistro;
	}
	/**
	 * @return the data_hora_sinistro
	 */
	public Timestamp getData_hora_sinistro() {
		return data_hora_sinistro;
	}
	/**
	 * @param data_hora_sinistro the data_hora_sinistro to set
	 */
	public void setData_hora_sinistro(Timestamp data_hora_sinistro) {
		this.data_hora_sinistro = data_hora_sinistro;
	}
	/**
	 * @return the endereco_sinistro
	 */
	public String getEndereco_sinistro() {
		return endereco_sinistro;
	}
	/**
	 * @param endereco_sinistro the endereco_sinistro to set
	 */
	public void setEndereco_sinistro(String endereco_sinistro) {
		this.endereco_sinistro = endereco_sinistro;
	}
	/**
	 * @return the tipo_ocorrencia_sinistro
	 */
	public String getTipo_ocorrencia_sinistro() {
		return tipo_ocorrencia_sinistro;
	}
	/**
	 * @param tipo_ocorrencia_sinistro the tipo_ocorrencia_sinistro to set
	 */
	public void setTipo_ocorrencia_sinistro(String tipo_ocorrencia_sinistro) {
		this.tipo_ocorrencia_sinistro = tipo_ocorrencia_sinistro;
	}

	
}