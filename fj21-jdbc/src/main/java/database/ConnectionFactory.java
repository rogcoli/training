package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {

	private static final Logger LOG = Logger.getAnonymousLogger();

	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		} catch (SQLException e) {
			LOG.log(Level.SEVERE, "Erro ao estabelecer conexão!", e);
		}
		return null;
	}

	public void close(Connection conn) throws SQLException {
		conn.close();
	}

}
