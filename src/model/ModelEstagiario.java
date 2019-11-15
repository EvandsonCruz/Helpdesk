package model;

public class ModelEstagiario {
	
	private int idEstagiario;
	private String login;
	private String senha;
	private String privilegio;
	
	
	public int getIdEstagiario() {
		return idEstagiario;
	}
	public void setIdEstagiario(int idEstagiario) {
		this.idEstagiario = idEstagiario;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getPrivilegio() {
		return privilegio;
	}
	public void setPrivilegio(String privilegio) {
		this.privilegio = privilegio;
	}
	
}
