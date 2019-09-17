//Wanderleá lodi
//10/04/2016

package br.com.listPooAdvanced;

import br.com.interfaces.AllowAccess;
import br.com.poo.People;

//heritage class People
public class Secretary extends People implements AllowAccess{
	
	private String registry;
	private String jobLevel;
	private String experience;
	
	@Override
	public double salary() {
		return 1800.80 * 0.9;
	}
	
	//Method of authentication contract
	@Override
	public boolean authenticate(String login, String passWord) {
		return login.equals("admin") && passWord.equals("admin");
	}
	
	@Override
	public boolean authenticate() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		return "Secretary [registry=" + registry + ", jobLevel=" + jobLevel
				+ ", experience=" + experience + ", name=" + name + ", age="
				+ age + ", birthDate=" + birthDate + ", documentRg="
				+ documentRg + ", documentCpf=" + documentCpf + ", motherName="
				+ motherName + ", fatherName=" + fatherName + "]";
	}
	
	public String getRegistry() {
		return registry;
	}
	public void setRegistry(String registry) {
		this.registry = registry;
	}
	public String getJobLevel() {
		return jobLevel;
	}
	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
}
