package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.activation.DataSource;

import model.ModelAdministrador;
import model.ModelEstagiario;

public class AdministradorDAO {
	
	private DataSource datasource;
	private Connection c;
	public AdministradorDAO() throws ClassNotFoundException, SQLException {
		GenericDAO gdao = new GenericDAO();
		c = gdao.getConnection();
		this.datasource = datasource;
	}
	
	public void insereAdministrador(ModelAdministrador adm) throws SQLException{
		String sql = "insert into Administrador (login,senha,privilegio) values (?,?,?)";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, adm.getLogin());
		ps.setString(2, adm.getSenha());
		ps.setString(3, adm.getPrivilegio());
		ps.execute();
		ps.close();
	}
	
	
	public boolean checkLogin(String login,String senha){
		boolean check = false;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try{
			//GenericDAO gdao = new GenericDAO();
		//String sql = "select * from Administrador where login = ? and senha = ?";
		
		ps = c.prepareStatement("select * from Administrador where login = ? and senha = ?");
		ps.setString(1,login);
		ps.setString(2,senha);
		rs = ps.executeQuery();
		
		if(rs.next()){
			//ModelAdministrador adm = new ModelAdministrador();
			
			check = true;
		}
		ps.close();
		return check;
		}
		catch(SQLException ex){
			System.err.println("Erro a recuperar " + ex.getMessage());
		}
		catch(Exception ex){
			System.err.println("Erro geral " + ex.getMessage());
		}
		return check;
	}
	
	public ArrayList<ModelAdministrador> readAll(){
		try{
			GenericDAO gdao = new GenericDAO();
		String sql = "select * from Administrador";
		PreparedStatement ps = gdao.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		ArrayList<ModelAdministrador> lista = new ArrayList<ModelAdministrador>();
		
		while(rs.next()){
			ModelAdministrador adm = new ModelAdministrador();
			adm.setIdAdministrador(rs.getInt("idAdministrador"));
			adm.setLogin(rs.getString("login"));
			adm.setSenha(rs.getString("senha"));
			lista.add(adm);
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
