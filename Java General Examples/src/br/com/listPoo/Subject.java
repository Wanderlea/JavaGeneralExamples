package br.com.listPoo;

import java.util.Arrays;

public class Subject {

	private String subject;
	private double[] note = new double[4];
	
	public double getAverageNote() {
		double TotalSum = 0;
		
		for (int pos = 0; pos < note.length; pos++) {
			TotalSum += note[pos]; 
		}
		
		return TotalSum/note.length;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double[] getNote() {
		return note;
	}

	public void setNote(double[] note) {
		this.note = note;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(note);
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		if (!Arrays.equals(note, other.note))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Subject [subject=" + subject + ", note=" + note + "]";
	}

}
