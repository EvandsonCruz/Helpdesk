package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.activation.DataSource;

import model.ModelChamado;
import model.ModelEstagiario;

public class ChamadoDAO {
	
	private DataSource datasource;
	private Connection c;
	public ChamadoDAO() throws ClassNotFoundException, SQLException {
		GenericDAO gdao = new GenericDAO();
		c = gdao.getConnection();
		this.datasource = datasource;
	}
	
	public void insereChamado(ModelChamado cha) throws SQLException{
		String sql = "insert into Chamado (idade,assunto,estado,disponibilidade,fila,atendimento,cliente,resposta) values (?,?,'aberto',?,'fila2',?,?,?)";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setString(1, cha.getIdade());
		ps.setString(2, cha.getAssunto());
		ps.setString(3, cha.getEstado());
		ps.setString(4, cha.getDisponibilidade());
		ps.setString(5, cha.getFila());
		ps.setString(6, cha.getAtendimento());
		ps.setString(7, cha.getCliente());
		ps.setString(8, cha.getResposta());
		ps.execute();
		ps.close();
	}
	
	public ArrayList<ModelChamado> readAll(){
		try{
			GenericDAO gdao = new GenericDAO();
		String sql = "select * from Chamado";
		PreparedStatement ps = gdao.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		ArrayList<ModelChamado> lista = new ArrayList<ModelChamado>();
		
		while(rs.next()){
			ModelChamado cha = new ModelChamado();
			cha.setIdChamado(rs.getInt("idChamado"));
			cha.setIdade(rs.getString("idade"));
			cha.setAssunto(rs.getString("assunto"));
			cha.setEstado(rs.getString("estado"));
			cha.setDisponibilidade(rs.getString("disponibilidade"));
			cha.setFila(rs.getString("fila"));
			cha.setAtendimento(rs.getString("atendimento"));
			cha.setCliente(rs.getString("cliente"));
			cha.setResposta(rs.getString("resposta"));
			lista.add(cha);
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
