package br.com.interfaces;

//authentication agreement
public interface AllowAccess {
	
	//just the method declaration
	public boolean authenticate();
	public boolean authenticate(String login, String passWord);
}
