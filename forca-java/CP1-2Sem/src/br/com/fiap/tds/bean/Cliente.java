package br.com.fiap.tds.bean;

/**
 * Classe que contém os dados do cliente
 * @author raiyi
 * @version 1.0
 *
 */


public class Cliente {
	
	/**
	 * Nome do cliente
	 */
	private String nome;
	/**
	 * Email do cliente
	 */
	private String email;
	/**
	 * Senha do cliente
	 */
	private String senha; 
	/**
	 * Data de nascimento do cliente
	 */
	private String dataNascimento;
	/**
	 * Código do cliente
	 */
	private String codCliente;
	
	
	//Construtor
	/**
	 * Inicializa uma instância com os atributos com valores padrões
	 */
	public Cliente() {}
	
	/**
	 * 
	 * @param nome Nome do cliente
	 * @param email Email do cliente
	 * @param senha Senha do cliente
	 * @param dataNascimento Data de nascimento do cliente
	 * @param codCliente Código do cliente
	 */
	
	public Cliente(String nome, String email, String senha, String dataNascimento, String codCliente) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
		this.codCliente = codCliente;
		
	}
	
	//Get & Set
	/**
	 * Recupera o nome do cliente
	 * @return Nome do cliente
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Altera o nome do cliente
	 * @param nome Nome do cliente
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Recupera o email do cliente
	 * @return Email do cliente
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Altera o email do cliente
	 * @param email Email do cliente
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Recupera a senha do cliente
	 * @return Senha do cliente
	 */
	public String getSenha() {
		return senha;
	}
	/**
	 * Altera a senha do cliente
	 * @param senha Senha do cliente
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	/**
	 * Recupera a data de nascimento do cliente
	 * @return Data de nascimento do cliente
	 */
	public String getDataNascimento() {
		return dataNascimento;
	}
	/**
	 * Altera a data de nascimento do cliente
	 * @param dataNascimento Data de Nasciemnto do cliente
	 */
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	/**
	 * Recupera o código do cliente
	 * @return Código do cliente
	 */
	public String getCodCliente() {
		return codCliente;
	}
	/**
	 * Altera o código do cliente
	 * @param codCliente Código do cliente
	 */
	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}
	
	
	
	//Métodos
	
	/**
	 * Método que retorna uma representação string de um objeto
	 * @return retorna os atributos instanciados no view
	 */
	@Override
	public String toString() {
		return   ("Nome: " + nome 
				+ "\nEmail: " + email 
				+ "\nSenha: " + senha
		        + "\nData de Nascimento: " + dataNascimento
		        + "\nCódigo do Cliente: " + codCliente);
	}
		
		 
}
	
	
	



