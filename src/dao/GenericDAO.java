package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDAO {
	
	private Connection c;
	
	Connection getConnection() throws ClassNotFoundException, SQLException{	
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=Helpdesk;namedPipes=true", "evandson", "123456");
        System.out.println("Conexao ok");
		return c;
		
	}
}
