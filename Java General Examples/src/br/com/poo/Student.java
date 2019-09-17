//Wanderleá lodi
//02/04/2016

package br.com.poo;

public class Student {
	
	//class attributes
	private String name;
	private int age;
	private String birthDate;
	private String documentRg;
	private String documentCpf;
	private String motherName;
	private String fatherName;
	private String registrationDate;
	private String nameSchool;
	private String registrationSerie;
	private Subject subject = new Subject();
	
	//Create data in memory java default
	public Student() {
		
	}
	
	public double getAverageNote(){
		return(subject.getNote1()+subject.getNote2()+subject.getNote3()+subject.getNote4())/4;
	}
	
	public boolean getApprovedStudent(){
		double Average = this.getAverageNote();
		if (Average >= 70)
			return true;
		else
			return false;
	}
	
	public Student(String defaultName) {		
		name = defaultName;		
	}
	
	

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getNameSchool() {
		return nameSchool;
	}

	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}

	public String getRegistrationSerie() {
		return registrationSerie;
	}

	public void setRegistrationSerie(String registrationSerie) {
		this.registrationSerie = registrationSerie;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", birthDate="
				+ birthDate + ", documentRg=" + documentRg + ", documentCpf="
				+ documentCpf + ", motherName=" + motherName + ", fatherName="
				+ fatherName + ", registrationDate=" + registrationDate
				+ ", nameSchool=" + nameSchool + ", registrationSerie="
				+ registrationSerie + ", subject=" + subject + "]";
	}

	//to compare student names
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}