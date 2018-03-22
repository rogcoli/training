package main;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import org.h2.tools.Server;

import database.ContatoDAO;
import entity.Contato;
import util.InitDatabase;

public class Main {

	public static void main(String[] args) throws SQLException {

		// start no servidor do banco de dados
		Server server = Server.createTcpServer(args).start();
		
		//Criando as tabelas 
		InitDatabase.createDb();

		//Criando o dao
		ContatoDAO dao = new ContatoDAO();

		// Criando Contato
		Contato contato = new Contato();

		contato.setNome("Coli");
		contato.setDataNascimento(Calendar.getInstance());

		System.out.println("Inserindo o contato: ");
		// inserir contato
		dao.inserir(contato);
		
		listarTodosOsContatos(dao);
		
		System.out.println("Atualizando o contato e inserindo no banco");
		
		Contato contatoBanco = dao.listar(1L);
		contatoBanco.setNome("MEU NOME EM CAIXA ALTA");
		dao.atualizar(contatoBanco);
		
		Contato contatoAtualizado = dao.listar(1L);
		
		System.out.println("Listando o contato atualizado por id");
		System.out.println(contatoAtualizado);
		
		System.out.println("Apagando o contato!");
		dao.apagar(contatoAtualizado);
		
		System.out.println("Listando todos os contatos após apagar");
		
		listarTodosOsContatos(dao);

		// stop the TCP Server
		server.stop();
	}

	private static void listarTodosOsContatos(ContatoDAO dao) throws SQLException {
		System.out.println("Listando todos os contatos: ");
		List<Contato> contatos = dao.listar();
		for (Contato c : contatos) {
			System.out.println(c);
		}
		System.out.println("------");
	}

}
