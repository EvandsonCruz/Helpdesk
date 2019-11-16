

import java.awt.Window;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import dao.AdministradorDAO;
import view.ViewPrincipal;

/**
 * Servlet implementation class checkLogin
 */
@WebServlet("/checkLogin")
public class checkLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		try {
			AdministradorDAO dao = new AdministradorDAO();
			
			if (dao.checkLogin(login, senha)){
				PrintWriter writer = response.getWriter();
				writer.println("<html><head>");
				writer.println("<script>");
				writer.println("alert('Logado com sucesso')");
				writer.println("window.location=\"Chamados.jsp\";");
				writer.println("</script>");
				writer.println("</head>");
				writer.println("<body></body></html>");
				writer.close();
				//response.sendRedirect("Chamados.jsp");
			}
			else{
				PrintWriter writer = response.getWriter();
				writer.println("<html><head>");
				writer.println("<script>");
				writer.println("alert('Login ou senha não confere')");
				writer.println("window.location=\"index.jsp\";");
				writer.println("</script>");
				writer.println("</head>");
				writer.println("<body></body></html>");
				writer.close();
				//response.sendRedirect("index.jsp");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//doGet(request, response);
	}

}
