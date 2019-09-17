//Wanderleá lodi
//10/05/2016

package br.com.poo;

//SuperClass Abstract
public abstract class People {
	
	protected String name;
	protected int age;
	protected String birthDate;
	protected String documentRg;
	protected String documentCpf;
	protected String motherName;
	protected String fatherName;
	
	//required method for child classes
	public abstract double salary();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getDocumentRg() {
		return documentRg;
	}
	public void setDocumentRg(String documentRg) {
		this.documentRg = documentRg;
	}
	public String getDocumentCpf() {
		return documentCpf;
	}
	public void setDocumentCpf(String documentCpf) {
		this.documentCpf = documentCpf;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	public boolean adultPerson(){
		return age >=18;
	}
	
	

}
