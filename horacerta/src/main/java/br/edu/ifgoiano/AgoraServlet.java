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
		// Pegando a data atual
		LocalDateTime date = LocalDateTime.now();
		
		//Criando um transformador que define uma forma padrão de data e hora em uma string
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		// Passando a data atual para o transformador e guardando a string dentro de data
		String data = formato.format(date);
		
		//Concatenando a data com o html
		String html = "<html><body><h1>"+ data +"</html></body></h1>";
		
		//Aqui, a gente passa o tipo de entrada que o request vai ter
		resp.setContentType("text/html;charset=UTF-8");
		//Aqui não sei
		resp.getWriter().print(html);
		
	}
	

}
