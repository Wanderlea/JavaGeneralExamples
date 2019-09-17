package br.com.arrays;

import br.com.listPoo.Student;
import br.com.listPoo.Subject;

public class ArrayVector {
	
	public static void main(String[] args) {
		
		/*String positions = JOptionPane.showInputDialog("How many positions the array should have? ");
		 
		double[] notes = new double[Integer.parseInt(positions)];
		
		for(int pos =0; pos < notes.length; pos++){
			String value = JOptionPane.showInputDialog("What is the position value? ");
			notes[pos] = Double.parseDouble(value);
		}		
		
		for(int pos =0; pos < notes.length; pos++){
			System.out.println("Note "+ (pos+1)+ " is "+ notes[pos]);
		}*/
		
		Student student = new Student();
		student.setName("mary");
		
		Subject subject = new Subject();
		subject.setSubject("Math");
		double[] notes = {10,8,9.5,7.9,9};
		subject.setNote(notes);
		
		student.getSubjects().add(subject);
		
		for(Subject s : student.getSubjects()){
			
			double notaMax = 0.0;
			
			System.out.println("Subject "+ s.getSubject());
			for(int pos =0; pos < s.getSubject().length(); pos++){
				System.out.println("Note "+pos+" is "+s.getNote()[pos]);
				
				if (pos == 0)
					notaMax = s.getNote()[pos];
				else{
					if (s.getNote()[pos] > notaMax)
						notaMax = s.getNote()[pos];
				}
				
			}
			
			System.out.println("The highest note of the discipline is: "+ s.getSubject() + "Note "+ notaMax);
			
		}
		
	}

}
