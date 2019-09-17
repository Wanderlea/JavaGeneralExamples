package br.com.listPoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.constant.StatusStudent;

public class FirstClasseExecutable {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("What is the login?");
		String password = JOptionPane.showInputDialog("What is the password?");
		
		if(login.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){

			List<Student> students = new ArrayList<Student>();
			
			//list with an identification key
			HashMap<String, List<Student>> maps = new HashMap<String, List<Student>>();												
			
			/*List<Student> studentsApproved = new ArrayList<Student>();
			List<Student> studentsRecuperation = new ArrayList<Student>();
			List<Student> studentsReproved = new ArrayList<Student>();*/
	
			for (int qtd = 1; qtd <= 3; qtd++) {
	
				// new instance
				Student student1 = new Student();
	
				String name = JOptionPane.showInputDialog("Name "+qtd+" ?");
				//String age = JOptionPane.showInputDialog("Age");
				student1.setName(name);
				// String to int
				//student1.setAge(Integer.valueOf(age));
	
				// add values to list
				for (int pos = 1; pos <= 1; pos++) {
					String nameSubject = JOptionPane.showInputDialog("Name of subject " + pos + " ?");
					String noteSubject = JOptionPane.showInputDialog("Note of subject " + pos + " ?");
					Subject subject = new Subject();
					subject.setSubject(nameSubject);
					double[] notes = {Double.valueOf(noteSubject)};
					subject.setNote(notes);
					student1.getSubjects().add(subject);
				}
	
				// remove values to list
				int option = JOptionPane.showConfirmDialog(null,
						"Do you want to remove some subject? ");
				if (option == 0) {
					int keepRemoving = 0;
					int position = 1;
					while (keepRemoving == 0) {
						String subjectRemove = JOptionPane.showInputDialog("What is the subject 1, 2, 3 or 4 ?");
						student1.getSubjects().remove(Integer.valueOf(subjectRemove).intValue() - position);
						position++;
						keepRemoving = JOptionPane.showConfirmDialog(null,"Keep removing sbjects ? ");
					}
				}
				
				students.add(student1);
			}
			//Initialization
			maps.put(StatusStudent.APPROVED, new ArrayList<Student>());
			maps.put(StatusStudent.RECUPERATION, new ArrayList<Student>());
			maps.put(StatusStudent.REPROVED, new ArrayList<Student>());
			
			//list by status
			/*for (Student student : students) {
				
				if(student.getApprovedStudent().equalsIgnoreCase(StatusStudent.APPROVED)){
					studentsApproved.add(student);
				}else if(student.getApprovedStudent().equalsIgnoreCase(StatusStudent.RECUPERATION)){
					studentsRecuperation.add(student);				
				}else if(student.getApprovedStudent().equalsIgnoreCase(StatusStudent.REPROVED)){
					studentsReproved.add(student);		
				}			
			}*/
			
			for (Student student : students) {
				
				if(student.getApprovedStudent().equalsIgnoreCase(StatusStudent.APPROVED)){
					maps.get(StatusStudent.APPROVED).add(student);
				}else if(student.getApprovedStudent().equalsIgnoreCase(StatusStudent.RECUPERATION)){
					maps.get(StatusStudent.RECUPERATION).add(student);				
				}else if(student.getApprovedStudent().equalsIgnoreCase(StatusStudent.REPROVED)){
					maps.get(StatusStudent.REPROVED).add(student);
				}			
			}
			
			System.out.println("-------------- List Approved ---------------");
			for (Student student : maps.get(StatusStudent.APPROVED)) {
				System.out.println("Name = "+student.getName()+ " Result = " + student.getApprovedStudent() + " Average = " + student.getAverageNote());
			}
			
			System.out.println("-------------- List Recuperation ---------------");
			for (Student student : maps.get(StatusStudent.RECUPERATION)) {
				System.out.println("Name = "+student.getName()+" Result = " + student.getApprovedStudent() + " Average = " + student.getAverageNote());
			}
			
			System.out.println("-------------- List Reproved ---------------");
			for (Student student : maps.get(StatusStudent.REPROVED)) {
				System.out.println("Name = "+student.getName()+" Result = " + student.getApprovedStudent() + " Average = " + student.getAverageNote());
			}
			
			/*for (Student student : students) {
	
				// student research
				if (student.getName().equalsIgnoreCase("Test")) {
					students.remove(student);
					break;
				}else{
					// all values
					System.out.println(student.toString());
	
					// System.out.println("Average is " +
					// student1.getAverageNote());
					System.out.println(student.getApprovedStudent() ? "Aluno Aprovado" : "Aluno Reprovado");
					System.out.println("----------------------------------------------------------------");
				}			
			}
			
			for (Student student : students){
				System.out.println("students on the list");
				System.out.println(student.getName());
				System.out.println("your subjects are");
				
				for(Subject subject: student.getSubjects()){
					System.out.println(subject.getSubject());
				}
			}*/
			
			//list positions
			/*for (int pos =0; pos < students.size(); pos++){
				
				Student student = students.get(pos);
				
				//replace students
				if (student.getName().equalsIgnoreCase("Test")){
					Student change = new Student();
					change.setName("changed student");
					
					Subject subject = new Subject();
					subject.setSubject("Java");
					subject.setNote(99);
					
					change.getSubjects().add(subject);
					
					students.set(pos, change);
					student = students.get(pos);
				}
				
				System.out.println("Student = "+student.getName());
				System.out.println("Average = "+student.getAverageNote());
				System.out.println("Resultado = "+student.getAverageNote());
				System.out.println("----------------------------------------------------------------");	
				
				//for (Subject subject : student.getSubjects()) {
				for (int poss = 0; poss < student.getSubjects().size(); poss++){
					Subject subject = student.getSubjects().get(poss);
					System.out.println("Subject = "+subject.getSubject() + " Note = "+ subject.getNote());
					System.out.println("----------------------------------------------------------------");
				}
			}*/
		}else{
			JOptionPane.showMessageDialog(null, "Invalid Password!");
		}
	}
}
