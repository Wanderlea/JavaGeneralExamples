//Wanderle� lodi
//10/05/2016

package br.com.listPooAdvanced;

import javax.swing.JOptionPane;
import br.com.poo.People;

public class TestChildClasses {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("Wanderl�a");
		student.setAge(25);
		
		Director director = new Director();
		director.setName("Paulo");
		director.setEducationRegistry("123");
		director.setAge(50);
		
		Secretary secretary = new Secretary();;
		secretary.setName("Mary");
		secretary.setExperience("Administrator");
		secretary.setAge(18);
		
		System.out.println(student.adultPerson()+ " - " + student.msgAdultPerson());
		System.out.println(director.adultPerson()); 
		System.out.println(secretary.adultPerson());
		
		System.out.println("Sal�rio Student: " + student.salary());
		System.out.println("Sal�rio Director: " + director.salary());
		System.out.println("Sal�rio Secretary: " + secretary.salary());
		
		test(student);
		test(director);
		test(secretary);
		
		if(secretary.authenticate(JOptionPane.showInputDialog("Login: "), JOptionPane.showInputDialog("Password: "))){
			JOptionPane.showMessageDialog(null, "Successfully authenticated!");
		}else
			JOptionPane.showMessageDialog(null, "Login or password invalid!");
	}
	
	public static void test(People people){
		System.out.println("People "+ people.getName() + "Salary "+ people.salary());
		
	}
	
}
