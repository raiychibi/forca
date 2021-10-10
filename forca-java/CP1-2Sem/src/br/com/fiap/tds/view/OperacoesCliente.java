package br.com.fiap.tds.view;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Cliente;

public class OperacoesCliente {
	
	/**
	 * 
	 * @param args
	 */
	
	public static void main (String[] args) {

	List<Cliente> listaclientes = new ArrayList<>();
	
	int menu = 0;
		
    while (menu != 7){
    	menu = Integer.parseInt(JOptionPane.showInputDialog(" ---------MENU---------"
				  + "\n1 - Cadastrar Clientes"
				  + "\n2 - Listar Clientes"
				  + "\n3 - Pesquisar por Código"
				  + "\n4 - Editar item do Cliente"
				  + "\n5 - Remover Cliente"
				  + "\n6 - Pesquisar por Nome"
				  + "\n7 - Sair"
				  + "\n\nDigite a opção desejada: "));
        switch (menu){
            case 1:
            	String nome = JOptionPane.showInputDialog("Digite o nome completo: ");
        		String email = JOptionPane.showInputDialog("Digite o email: ");
        		String senha = JOptionPane.showInputDialog("Digite a senha: ");
        		String dataNascimento = JOptionPane.showInputDialog("Digite a data de nascimento: ");
        		String codCliente = JOptionPane.showInputDialog("Digite o código de cliente: ");
        		
        		Cliente cliente = new Cliente(nome, email, senha, dataNascimento, codCliente);
        		
        		listaclientes.add(cliente);
        
                break;
            case 2:
            	for(Cliente c: listaclientes) {
            		System.out.println(c);
            		System.out.println("----------------------------");
            	}
                break;
            case 3:	
            	String cod = JOptionPane.showInputDialog("Digite o código de cliente: ");
            	boolean checarCod = false; 
            	for(Cliente c : listaclientes) {
            		
            		if (c.getCodCliente().equals(cod)) {
            			checarCod = true;
            			System.out.println("Este código pertence a este cliente: ");
            			System.out.println(c);
            		}
            	}
        		if(!checarCod) System.out.println("Esse código não existe!");
                break; 
            case 4:
            	
            	String codigo = JOptionPane.showInputDialog("Digite o código de cliente: ");
            	
            	int altera = Integer.parseInt(JOptionPane.showInputDialog("1- Nome\n2- Email\n3- Senha\n4- Data de Nascimento\n5- Código do Cliente"
            																+ "Digite o número do item que deseja alterar: "));
            	String novo = JOptionPane.showInputDialog("Crie seu novo item: " );
            	
            	boolean checarCodigo = false;
            	
            	 for(Cliente c : listaclientes) { 
            		 if(codigo.equals(c.getCodCliente())) {
            			checarCodigo = true;
                			
            			 switch(altera) {
            			 
            			 
            			 case 1:
            				 c.setNome(novo);
            				 break;
            				 
            			 case 2:
            				 c.setEmail(novo);
            				 break;
            				 
            			 case 3:
            				 c.setSenha(novo);
            				 break;
            				 
            			 case 4:
            				 c.setDataNascimento(novo);
            				 break;
            				 
            			 case 5:
            				 c.setCodCliente(novo);
            				 break;
            				 
            			 default:
            				 System.out.println("Esse item não exite!");
            				 
            			 }
            		 } 
            	 }
            	 if(!checarCodigo) System.out.println("Esse código não existe!");
                break;
            case 5:
             	String codigoCli = JOptionPane.showInputDialog("Digite o código de cliente para removê-lo: ");
            	boolean checarRem = false; 
            	for(Cliente c : listaclientes) {
            		
            		if (c.getCodCliente().equals(codigoCli)) {
            			checarRem = true;
            			listaclientes.remove(c);
            		}
            	}
        		if(!checarRem) System.out.println("Esse código não existe!");
                break;
            case 6:
            	String nom = JOptionPane.showInputDialog("Digite o nome de cliente: ");
            	boolean checarNome = false; 
            	for(Cliente c : listaclientes) {
            		
            		if (c.getNome().equals(nom)) {
            			checarNome = true;
            			System.out.println("Este nome pertence a este cliente: ");
            			System.out.println(c);
            		}
            	}
        		if(!checarNome) System.out.println("Esse nome não existe!");
                break; 
            	 
    
         }
    }
	
    } 
			
    }


