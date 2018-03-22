package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Contato;
import util.DateUtil;

public class ContatoDAO {

	private ConnectionFactory factory;
	private Connection conn;

	public ContatoDAO() {
		this.factory = new ConnectionFactory();

	}

	public void inserir(Contato contato) throws SQLException {

		this.conn = factory.getConnection();

		String sql = "INSERT INTO contatos (nome, email, endereco, dataNascimento) VALUES (?, ?, ?, ?);";

		PreparedStatement st = conn.prepareStatement(sql);

		st.setString(1, contato.getNome());
		st.setString(2, contato.getEmail());
		st.setString(3, contato.getEndereco());
		st.setDate(4, DateUtil.convert(contato.getDataNascimento()));

		st.execute();

		factory.close(conn);
	}

	// vai dar erro se nao tiver nenhum?
	public Contato listar(Long id) throws SQLException {
		return listarContatos(id).get(0);
	}

	public List<Contato> listar() throws SQLException {
		return listarContatos(null);
	}

	private List<Contato> listarContatos(Long id) throws SQLException {

		this.conn = factory.getConnection();

		List<Contato> toReturn = new ArrayList<Contato>();

		String sql = "SELECT * FROM contatos";

		if (id != null && id > 0) {
			sql = "SELECT * FROM contatos WHERE id = ?";
		}

		PreparedStatement st = conn.prepareStatement(sql);
		
		if (id != null && id > 0) {
			st.setLong(1, id);
		}

		ResultSet rs = st.executeQuery();

		while (rs.next()) {

			Contato c = new Contato();

			c.setId(rs.getLong(1));
			c.setNome(rs.getString(2));
			c.setEmail(rs.getString(3));
			c.setEndereco(rs.getString(4));
			c.setDataNascimento(DateUtil.convert(rs.getDate(5)));

			toReturn.add(c);
		}
		factory.close(conn);

		return toReturn;
	}

	public void apagar(Contato contato) throws SQLException {

		this.conn = factory.getConnection();

		String sql = "DELETE FROM contatos WHERE id = ?";

		PreparedStatement st = conn.prepareStatement(sql);

		st.setLong(1, contato.getId());
		st.execute();

		factory.close(conn);
	}

	public void atualizar(Contato contato) throws SQLException {

		this.conn = factory.getConnection();

		String sql = "UPDATE contatos SET nome = ?, email = ?, endereco = ?, dataNascimento = ? WHERE id = ?;";

		PreparedStatement st = conn.prepareStatement(sql);

		st.setString(1, contato.getNome());
		st.setString(2, contato.getEmail());
		st.setString(3, contato.getEndereco());
		st.setDate(4, DateUtil.convert(contato.getDataNascimento()));
		st.setLong(5, contato.getId());

		st.execute();

		factory.close(conn);
	}

}
