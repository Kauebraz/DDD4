package com.example.porto.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Classe de guincho que criar os seus atributos com informações sobre o guincho e os métodos getters e setters
 */
@Table(name="TB_GUINCHO")
@Entity
public class Guincho {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_guincho;
	private String modelo_guincho;
	private int altura_guincho_cm;
	private int largura_guincho_cm;
	private int comprimento_guincho_cm;
	private int capacidade_carga_guincho_kg;
	private String tipo_modal;
	private String placa_modal;
	/**
	 * @param id_guincho
	 * @param modelo_guincho
	 * @param altura_guincho_cm
	 * @param largura_guincho_cm
	 * @param comprimento_guincho_cm
	 * @param capacidade_carga_guincho_kg
	 * @param tipo_modal
	 * @param placa_modal
	 */
	public Guincho(Long id_guincho, String modelo_guincho, int altura_guincho_cm, int largura_guincho_cm,
			int comprimento_guincho_cm, int capacidade_carga_guincho_kg, String tipo_modal, String placa_modal) {
		super();
		this.id_guincho = id_guincho;
		this.modelo_guincho = modelo_guincho;
		this.altura_guincho_cm = altura_guincho_cm;
		this.largura_guincho_cm = largura_guincho_cm;
		this.comprimento_guincho_cm = comprimento_guincho_cm;
		this.capacidade_carga_guincho_kg = capacidade_carga_guincho_kg;
		this.tipo_modal = tipo_modal;
		this.placa_modal = placa_modal;
	}
	/**
	 * @return the id_guincho
	 */
	public Long getId_guincho() {
		return id_guincho;
	}
	/**
	 * @param id_guincho the id_guincho to set
	 */
	public void setId_guincho(Long id_guincho) {
		this.id_guincho = id_guincho;
	}
	/**
	 * @return the modelo_guincho
	 */
	public String getModelo_guincho() {
		return modelo_guincho;
	}
	/**
	 * @param modelo_guincho the modelo_guincho to set
	 */
	public void setModelo_guincho(String modelo_guincho) {
		this.modelo_guincho = modelo_guincho;
	}
	/**
	 * @return the altura_guincho_cm
	 */
	public int getAltura_guincho_cm() {
		return altura_guincho_cm;
	}
	/**
	 * @param altura_guincho_cm the altura_guincho_cm to set
	 */
	public void setAltura_guincho_cm(int altura_guincho_cm) {
		this.altura_guincho_cm = altura_guincho_cm;
	}
	/**
	 * @return the largura_guincho_cm
	 */
	public int getLargura_guincho_cm() {
		return largura_guincho_cm;
	}
	/**
	 * @param largura_guincho_cm the largura_guincho_cm to set
	 */
	public void setLargura_guincho_cm(int largura_guincho_cm) {
		this.largura_guincho_cm = largura_guincho_cm;
	}
	/**
	 * @return the comprimento_guincho_cm
	 */
	public int getComprimento_guincho_cm() {
		return comprimento_guincho_cm;
	}
	/**
	 * @param comprimento_guincho_cm the comprimento_guincho_cm to set
	 */
	public void setComprimento_guincho_cm(int comprimento_guincho_cm) {
		this.comprimento_guincho_cm = comprimento_guincho_cm;
	}
	/**
	 * @return the capacidade_carga_guincho_kg
	 */
	public int getCapacidade_carga_guincho_kg() {
		return capacidade_carga_guincho_kg;
	}
	/**
	 * @param capacidade_carga_guincho_kg the capacidade_carga_guincho_kg to set
	 */
	public void setCapacidade_carga_guincho_kg(int capacidade_carga_guincho_kg) {
		this.capacidade_carga_guincho_kg = capacidade_carga_guincho_kg;
	}
	/**
	 * @return the tipo_modal
	 */
	public String getTipo_modal() {
		return tipo_modal;
	}
	/**
	 * @param tipo_modal the tipo_modal to set
	 */
	public void setTipo_modal(String tipo_modal) {
		this.tipo_modal = tipo_modal;
	}
	/**
	 * @return the placa_modal
	 */
	public String getPlaca_modal() {
		return placa_modal;
	}
	/**
	 * @param placa_modal the placa_modal to set
	 */
	public void setPlaca_modal(String placa_modal) {
		this.placa_modal = placa_modal;
	}
	
	
}
