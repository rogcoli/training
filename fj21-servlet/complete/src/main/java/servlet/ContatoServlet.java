package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.ContatoDAO;
import entity.Contato;
import util.URLHelper;

@WebServlet("/contato")
public class ContatoServlet extends HttpServlet {

	private static final long serialVersionUID = 6742123504023910944L;

	private ContatoDAO dao = new ContatoDAO();

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String acao = req.getParameter("acao");
		
		
		
		
		String nome = req.getParameter("contato.nome");
		String email = req.getParameter("contato.email");

		try {
			
			
			Contato contatoDeletar = new Contato();
			
			
			switch (acao) {
			case "deletar":
				
				String id = req.getParameter("contato.id");
				
				// logica delete
				dao.apagar(contatoDeletar);
				
				
				break;

			default:
				break;
			}
			
			
			
			
			

			if (nome != null) {

				Contato c = contatoDeletar;
				c.setNome(nome);
				c.setEmail(email);

				dao.inserir(c);

			}

			List<Contato> contatosFromDb = dao.listar();
			
			
			List<Contato> contatos = !contatosFromDb.isEmpty() ? contatosFromDb : Arrays.asList(contatoDeletar);
			req.setAttribute("listaContatos", contatos);
			
			//Contato coantatoBaseEditar =  dao.listar(id);
			//req.setAttribute("contatoSelecionado", coantatoBaseEditar );
			
			
		} catch (SQLException e) {
			// TODO handle later
			e.printStackTrace();
		}

		RequestDispatcher rd = req.getRequestDispatcher(URLHelper.to("contato.jsp"));

		rd.forward(req, resp);

	}

}
