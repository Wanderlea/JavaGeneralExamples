package br.com.arrays;

import br.com.listPoo.Student;
import br.com.listPoo.Subject;

public class ArrayVectorObject {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.setName("mary");
		
		Subject subject = new Subject();
		subject.setSubject("Math");
		double[] notes = {10,8,9.5,7.9,9};
		subject.setNote(notes);

		Subject subject1 = new Subject();
		subject1.setSubject("Test");
		double[] notes1 = {10,5,9.5,7.9,9};
		subject1.setNote(notes1);
		
		student.getSubjects().add(subject);
		student.getSubjects().add(subject1);
		
		Student[] arrayStudent = new Student[1];
		
		arrayStudent[0] = student;
		
		for (int pos = 0; pos < arrayStudent.length; pos++) {
			
			System.out.println("Student Name "+ arrayStudent[pos].getName());
			
			for (Subject s : arrayStudent[pos].getSubjects()) {
				System.out.println("Subject Name "+ s.getSubject());
				
				for (int posNote = 0; posNote < s.getNote().length; posNote++) {
					System.out.println("Student Note "+posNote+" is "+s.getNote()[posNote]);
				}
			}
			
		}
		
	}

}
