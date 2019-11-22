

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ChamadoDAO;
import model.ModelChamado;

/**
 * Servlet implementation class ReadAllChamado
 */
@WebServlet("/ReadAllChamado")
public class ReadAllChamado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadAllChamado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 ChamadoDAO dao = null;
			ArrayList<ModelChamado> lista = new ArrayList<ModelChamado>();
			 lista = dao.readAll();
			 PrintWriter writer = response.getWriter();
			 for(ModelChamado mc: lista) {
				 writer.println("<tr>");
				 writer.println("<td>");
				 mc.getIdChamado();
				 writer.println("</td>");
			        /*<td>1mc.getIdade()</td>
			        <td>Pc não liga</td>
			        <td>Aberto</td>
			        <td>Desbloqueado</td>
			        <td>fila2</td>
			        <td>Evandson</td>
			        <td>Antonio</td>*/
				 writer.println("</tr>");
			 }
			 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
