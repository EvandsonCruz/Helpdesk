package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.activation.DataSource;

import model.ModelEfetivo;
import model.ModelEstagiario;

public class EfetivoDAO {
	
	private DataSource datasource;
	private Connection c;
	public EfetivoDAO() throws ClassNotFoundException, SQLException {
		GenericDAO gdao = new GenericDAO();
		c = gdao.getConnection();
		this.datasource = datasource;
	}
	
	public void insereEfetivo(ModelEfetivo efe) throws SQLException{
		String sql = "insert into Efetivo (login,senha,privilegio) values (?,?,?)";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, efe.getLogin());
		ps.setString(2, efe.getSenha());
		ps.setString(3, efe.getPrivilegio());
		ps.execute();
		ps.close();
	}
	
	public ArrayList<ModelEfetivo> readAll(){
		try{
			GenericDAO gdao = new GenericDAO();
		String sql = "select * from Efetivo";
		PreparedStatement ps = gdao.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		ArrayList<ModelEfetivo> lista = new ArrayList<ModelEfetivo>();
		
		while(rs.next()){
			ModelEfetivo est = new ModelEfetivo();
			est.setIdEfetivo(rs.getInt("idEfetivo"));
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