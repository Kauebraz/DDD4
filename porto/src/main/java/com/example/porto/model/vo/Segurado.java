package com.example.porto.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * @author Kauê rm97768, Thomas rm99832, Gabriel rm98986, Matheus Giusto rm99969, Matheus Dantas rm98406
 * @see Classe de segurado que criar os seus atributos com informações pessoais e os métodos getters e setters
 */
@Table(name="TB_SEGURADO")
@Entity
public class Segurado{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_segurado;
	private String nome_segurado;
	private String cpfCnpj;
	private String email_segurado;
	private String endereco_segurado;
	private String telefone_segurado;
	private String senha_segurado;
	
	/**
	 * Construtor vazio
	 */
	public Segurado() {
		
	}
	/**
	 * @param id_segurado
	 * @param nome_segurado
	 * @param cpf_cnpj
	 * @param email_segurado
	 * @param endereco_segurado
	 * @param telefone_segurado
	 * @param senha_segurado
	 */
	public Segurado(Long id_segurado, String nome_segurado, String cpfCnpj, String email_segurado,
			String endereco_segurado, String telefone_segurado, String senha_segurado) {
		super();
		this.id_segurado = id_segurado;
		this.nome_segurado = nome_segurado;
		this.cpfCnpj = cpfCnpj;
		this.email_segurado = email_segurado;
		this.endereco_segurado = endereco_segurado;
		this.telefone_segurado = telefone_segurado;
		this.senha_segurado = senha_segurado;
	}
	/**
	 * @return the id_segurado
	 */
	public Long getId_segurado() {
		return id_segurado;
	}
	/**
	 * @param id_segurado the id_segurado to set
	 */
	public void setId_segurado(Long id_segurado) {
		this.id_segurado = id_segurado;
	}
	/**
	 * @return the nome_segurado
	 */
	public String getNome_segurado() {
		return nome_segurado;
	}
	/**
	 * @param nome_segurado the nome_segurado to set
	 */
	public void setNome_segurado(String nome_segurado) {
		this.nome_segurado = nome_segurado;
	}
	/**
	 * @return the cpf_cnpj
	 */
	public String getcpfCnpj() {
		return cpfCnpj;
	}
	/**
	 * @param cpf_cnpj the cpf_cnpj to set
	 */
	public void setcpfCnpj(String cpf_cnpj) {
		this.cpfCnpj = cpf_cnpj;
	}
	/**
	 * @return the email_segurado
	 */
	public String getEmail_segurado() {
		return email_segurado;
	}
	/**
	 * @param email_segurado the email_segurado to set
	 */
	public void setEmail_segurado(String email_segurado) {
		this.email_segurado = email_segurado;
	}
	/**
	 * @return the endereco_segurado
	 */
	public String getEndereco_segurado() {
		return endereco_segurado;
	}
	/**
	 * @param endereco_segurado the endereco_segurado to set
	 */
	public void setEndereco_segurado(String endereco_segurado) {
		this.endereco_segurado = endereco_segurado;
	}
	/**
	 * @return the telefone_segurado
	 */
	public String getTelefone_segurado() {
		return telefone_segurado;
	}
	/**
	 * @param telefone_segurado the telefone_segurado to set
	 */
	public void setTelefone_segurado(String telefone_segurado) {
		this.telefone_segurado = telefone_segurado;
	}
	/**
	 * @return the senha_segurado
	 */
	public String getSenha_segurado() {
		return senha_segurado;
	}
	/**
	 * @param senha_segurado the senha_segurado to set
	 */
	public void setSenha_segurado(String senha_segurado) {
		this.senha_segurado = senha_segurado;
	}

	
	
}