package model;

public class ModelEfetivo {
	
	private int idEfetivo;
	private String login;
	private String senha;
	private String privilegio;
	
	
	public int getIdEfetivo() {
		return idEfetivo;
	}
	public void setIdEfetivo(int idEfetivo) {
		this.idEfetivo = idEfetivo;
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
