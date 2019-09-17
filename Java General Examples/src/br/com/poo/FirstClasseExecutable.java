package br.com.poo;

import javax.swing.JOptionPane;

public class FirstClasseExecutable {
	
	public static void main(String[] args) {
		
		//new instance
		Student student1 = new Student();
		
		//Student2 object reference
		Student student2 = new Student();
		
		Student student3 = new Student();
		
		Student student4 = new Student("Mary");
		
		String name1 = JOptionPane.showInputDialog("Name");
		String age = JOptionPane.showInputDialog("Age");
		String note1 = JOptionPane.showInputDialog("nota 1");
		String note2 = JOptionPane.showInputDialog("nota 2");
		String note3 = JOptionPane.showInputDialog("nota 3");
		String note4 = JOptionPane.showInputDialog("nota 4");
		
		student1.setName(name1);
		//String to int
		student1.setAge(Integer.valueOf(age));
		//String to double
		student1.getSubject().setNote1(Double.parseDouble(note1));
		student1.getSubject().setNote2(Double.parseDouble(note2));
		student1.getSubject().setNote3(Double.parseDouble(note3));
		student1.getSubject().setNote4(Double.parseDouble(note4));
		
		//all values
		System.out.println(student1.toString());
		
		//System.out.println("Average is " + student1.getAverageNote());
		System.out.println(student1.getApprovedStudent() ? "Aluno Aprovado":"Aluno Reprovado");
		
		/*Equals e hascode to differentiate and compare objects*/		
		if (student1.equals(student2)){
			System.out.println("equal students");
		}else{
			System.out.println("different students");
		}
		
	}

}
