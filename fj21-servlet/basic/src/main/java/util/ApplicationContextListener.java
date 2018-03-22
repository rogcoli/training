package util;

import java.util.logging.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ApplicationContextListener implements ServletContextListener {

	private static final Logger LOG = Logger.getAnonymousLogger();
	// Descomentar apos incluir dependencia do fj21-jdbc
	//private Server server;

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("Encerrando o servidor!");
		//server.stop();
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Iniciando o servidor!");

//		try {
//			server = Server.createTcpServer();
//			InitDatabase.createDb();
//		} catch (SQLException e) {
//			LOG.log(Level.SEVERE, "Erro ao inicializar o banco H2", e);
//		}
	}

}
