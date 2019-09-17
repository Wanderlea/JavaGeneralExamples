//Wanderleá lodi
//10/05/2016

package br.com.listPooAdvanced;

import br.com.poo.People;

// heritage class People
public class Director extends People{
	
	private String educationRegistry;
	private int DirectionTime;
	private String titration;
	
	public int getDirectionTime() {
		return DirectionTime;
	}
	public void setDirectionTime(int directionTime) {
		DirectionTime = directionTime;
	}
	public String getTitration() {
		return titration;
	}
	public void setTitration(String titration) {
		this.titration = titration;
	}
	public String getEducationRegistry() {
		return educationRegistry;
	}
	public void setEducationRegistry(String educationRegistry) {
		this.educationRegistry = educationRegistry;
	}
	@Override
	public String toString() {
		return "Director [educationRegistry=" + educationRegistry
				+ ", DirectionTime=" + DirectionTime + ", titration="
				+ titration + ", name=" + name + ", age=" + age
				+ ", birthDate=" + birthDate + ", documentRg=" + documentRg
				+ ", documentCpf=" + documentCpf + ", motherName=" + motherName
				+ ", fatherName=" + fatherName + "]";
	}
	@Override
	public double salary() {
		// TODO Auto-generated method stub
		return 3900.78;
	}

}
