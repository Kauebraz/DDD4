package com.example.porto.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Classe de apolice que criar os seus atributos com tipo e valor e os métodos getters e setters
 */

@Table(name="TB_APOLICE")
@Entity
public class Apolice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_apolice;
	private int numero_apolice;
	private String tipo_apolice;
	private float valor_apolice;
	/**
	 * @param id_apolice
	 * @param numero_apolice
	 * @param tipo_apolice
	 * @param valor_apolice
	 */
	public Apolice(Long id_apolice, int numero_apolice, String tipo_apolice, float valor_apolice) {
		super();
		this.id_apolice = id_apolice;
		this.numero_apolice = numero_apolice;
		this.tipo_apolice = tipo_apolice;
		this.valor_apolice = valor_apolice;
	}
	/**
	 * @return the id_apolice
	 */
	public Long getId_apolice() {
		return id_apolice;
	}
	/**
	 * @param id_apolice the id_apolice to set
	 */
	public void setId_apolice(Long id_apolice) {
		this.id_apolice = id_apolice;
	}
	/**
	 * @return the numero_apolice
	 */
	public int getNumero_apolice() {
		return numero_apolice;
	}
	/**
	 * @param numero_apolice the numero_apolice to set
	 */
	public void setNumero_apolice(int numero_apolice) {
		this.numero_apolice = numero_apolice;
	}
	/**
	 * @return the tipo_apolice
	 */
	public String getTipo_apolice() {
		return tipo_apolice;
	}
	/**
	 * @param tipo_apolice the tipo_apolice to set
	 */
	public void setTipo_apolice(String tipo_apolice) {
		this.tipo_apolice = tipo_apolice;
	}
	/**
	 * @return the valor_apolice
	 */
	public float getValor_apolice() {
		return valor_apolice;
	}
	/**
	 * @param valor_apolice the valor_apolice to set
	 */
	public void setValor_apolice(float valor_apolice) {
		this.valor_apolice = valor_apolice;
	}
	
	
	
}
