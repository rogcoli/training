package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.ConnectionFactory;

public class InitDatabase {
	
	
	
	public static void createDb() throws SQLException {

		Connection con = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");

		String drop = "DROP TABLE IF EXISTS contatos";
		PreparedStatement drops = con.prepareStatement(drop);
		boolean exDrop = drops.execute();

		String create = "create table contatos (id BIGINT AUTO_INCREMENT, nome VARCHAR(255), email VARCHAR(255), endereco VARCHAR(255), dataNascimento DATE, primary key (id) );";

		PreparedStatement ps = con.prepareStatement(create);
		ps.execute();
	}

}
