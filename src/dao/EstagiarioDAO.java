package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.activation.DataSource;

import model.ModelEstagiario;

public class EstagiarioDAO {
	
	private DataSource datasource;
	private Connection c;
	public EstagiarioDAO(DataSource dataSource) throws ClassNotFoundException, SQLException {
		GenericDAO gdao = new GenericDAO();
		c = gdao.getConnection();
		this.datasource = datasource;
	}
	
	public void insereEstagiario(ModelEstagiario est) throws SQLException{
		String sql = "insert into Estagiario (login,senha,privilegio) values (?,?,?)";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, est.getLogin());
		ps.setString(2, est.getSenha());
		ps.setString(3, est.getPrivilegio());
		ps.execute();
		ps.close();
	}
	
	public ArrayList<ModelEstagiario> readAll(){
		try{
		GenericDAO gdao = new GenericDAO();
		String sql = "select * from Estagiario";
		PreparedStatement ps = gdao.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		ArrayList<ModelEstagiario> lista = new ArrayList<ModelEstagiario>();
		
		while(rs.next()){
			ModelEstagiario est = new ModelEstagiario();
			est.setIdEstagiario(rs.getInt("idEstagiario"));
			est.setLogin(rs.getString("login"));
			est.setSenha(rs.getString("senha"));
			lista.add(est);
		}
		ps.close();
		return lista;
		}
		catch(SQLException ex){
			System.err.println("Erro a recuperar " + ex.getMessage());
		}
		catch(Exception ex){
			System.err.println("Erro geral " + ex.getMessage());
		}
		return null;
	}
}
