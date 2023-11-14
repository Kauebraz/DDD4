package com.example.porto.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Classe de veículo que cria os seus atributos com informações sobre o veículo do segurado e os métodos getters e setters
 */
@Table(name="TB_VEICULO")
@Entity
public class Veiculo{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_veiculo;
	private String modelo_veiculo;
    private int altura_veiculo_cm;
    private int largura_veiculo_cm;
    private int comprimento_veiculo_cm;
    private int peso_veiculo_kg;
    private String placa_veiculo;
    private int capacidade_combustivel_litros;
    
    public Veiculo() {
    	
    }
    
	/**
	 * @param id_veiculo
	 * @param modelo_veiculo
	 * @param altura_veiculo_cm
	 * @param largura_veiculo_cm
	 * @param comprimento_veiculo_cm
	 * @param peso_veiculo_kg
	 * @param placa_veiculo
	 * @param capacidade_combustivel_litros
	 */
	public Veiculo(Long id_veiculo, String modelo_veiculo, int altura_veiculo_cm, int largura_veiculo_cm,
			int comprimento_veiculo_cm, int peso_veiculo_kg, String placa_veiculo, int capacidade_combustivel_litros) {
		super();
		this.id_veiculo = id_veiculo;
		this.modelo_veiculo = modelo_veiculo;
		this.altura_veiculo_cm = altura_veiculo_cm;
		this.largura_veiculo_cm = largura_veiculo_cm;
		this.comprimento_veiculo_cm = comprimento_veiculo_cm;
		this.peso_veiculo_kg = peso_veiculo_kg;
		this.placa_veiculo = placa_veiculo;
		this.capacidade_combustivel_litros = capacidade_combustivel_litros;
	}
	/**
	 * @return the id_veiculo
	 */
	public Long getId_veiculo() {
		return id_veiculo;
	}
	/**
	 * @param id_veiculo the id_veiculo to set
	 */
	public void setId_veiculo(Long id_veiculo) {
		this.id_veiculo = id_veiculo;
	}
	/**
	 * @return the modelo_veiculo
	 */
	public String getModelo_veiculo() {
		return modelo_veiculo;
	}
	/**
	 * @param modelo_veiculo the modelo_veiculo to set
	 */
	public void setModelo_veiculo(String modelo_veiculo) {
		this.modelo_veiculo = modelo_veiculo;
	}
	/**
	 * @return the altura_veiculo_cm
	 */
	public int getAltura_veiculo_cm() {
		return altura_veiculo_cm;
	}
	/**
	 * @param altura_veiculo_cm the altura_veiculo_cm to set
	 */
	public void setAltura_veiculo_cm(int altura_veiculo_cm) {
		this.altura_veiculo_cm = altura_veiculo_cm;
	}
	/**
	 * @return the largura_veiculo_cm
	 */
	public int getLargura_veiculo_cm() {
		return largura_veiculo_cm;
	}
	/**
	 * @param largura_veiculo_cm the largura_veiculo_cm to set
	 */
	public void setLargura_veiculo_cm(int largura_veiculo_cm) {
		this.largura_veiculo_cm = largura_veiculo_cm;
	}
	/**
	 * @return the comprimento_veiculo_cm
	 */
	public int getComprimento_veiculo_cm() {
		return comprimento_veiculo_cm;
	}
	/**
	 * @param comprimento_veiculo_cm the comprimento_veiculo_cm to set
	 */
	public void setComprimento_veiculo_cm(int comprimento_veiculo_cm) {
		this.comprimento_veiculo_cm = comprimento_veiculo_cm;
	}
	/**
	 * @return the peso_veiculo_kg
	 */
	public int getPeso_veiculo_kg() {
		return peso_veiculo_kg;
	}
	/**
	 * @param peso_veiculo_kg the peso_veiculo_kg to set
	 */
	public void setPeso_veiculo_kg(int peso_veiculo_kg) {
		this.peso_veiculo_kg = peso_veiculo_kg;
	}
	/**
	 * @return the placa_veiculo
	 */
	public String getPlaca_veiculo() {
		return placa_veiculo;
	}
	/**
	 * @param placa_veiculo the placa_veiculo to set
	 */
	public void setPlaca_veiculo(String placa_veiculo) {
		this.placa_veiculo = placa_veiculo;
	}
	/**
	 * @return the capacidade_combustivel_litros
	 */
	public int getCapacidade_combustivel_litros() {
		return capacidade_combustivel_litros;
	}
	/**
	 * @param capacidade_combustivel_litros the capacidade_combustivel_litros to set
	 */
	public void setCapacidade_combustivel_litros(int capacidade_combustivel_litros) {
		this.capacidade_combustivel_litros = capacidade_combustivel_litros;
	}
    
    
	
}
