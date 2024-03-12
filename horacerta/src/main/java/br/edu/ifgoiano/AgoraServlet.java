package br.edu.ifgoiano;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/agora")	

public class AgoraServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Processamento de Backend
		
		// Pegando a data atual
		LocalDateTime date = LocalDateTime.now();
		
		//Criando um transformador que define uma forma padrão de data e hora em uma string
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		// Passando a data atual para o transformador e guardando a string dentro de data
		String data = formato.format(date);
		
		//Armazenando valores para a JSP
		req.setAttribute("dataHora", data);
		
		
		//Retornar para a página agora ServLet
		req.getRequestDispatcher("dataHoraCerta.jsp")
		.forward(req, resp); // Vai para essa página e envia tambem a requisicao e a resposta
		
		
		
		
	}
	

}
