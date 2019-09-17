package br.com.poo;

public class Subject {
	
	private String subject1;
	private String subject2;
	private String subject3;
	private String subject4;
	private double note1;
	private double note2;
	private double note3;
	private double note4;
		
	public String getSubject1() {
		return subject1;
	}
	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}
	public String getSubject2() {
		return subject2;
	}
	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}
	public String getSubject3() {
		return subject3;
	}
	public void setSubject3(String subject3) {
		this.subject3 = subject3;
	}
	public String getSubject4() {
		return subject4;
	}
	public void setSubject4(String subject4) {
		this.subject4 = subject4;
	}
	public double getNote1() {
		return note1;
	}
	public void setNote1(double note1) {
		this.note1 = note1;
	}
	public double getNote2() {
		return note2;
	}
	public void setNote2(double note2) {
		this.note2 = note2;
	}
	public double getNote3() {
		return note3;
	}
	public void setNote3(double note3) {
		this.note3 = note3;
	}
	public double getNote4() {
		return note4;
	}
	public void setNote4(double note4) {
		this.note4 = note4;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(note1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(note2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(note3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(note4);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((subject1 == null) ? 0 : subject1.hashCode());
		result = prime * result
				+ ((subject2 == null) ? 0 : subject2.hashCode());
		result = prime * result
				+ ((subject3 == null) ? 0 : subject3.hashCode());
		result = prime * result
				+ ((subject4 == null) ? 0 : subject4.hashCode());
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
		if (Double.doubleToLongBits(note1) != Double
				.doubleToLongBits(other.note1))
			return false;
		if (Double.doubleToLongBits(note2) != Double
				.doubleToLongBits(other.note2))
			return false;
		if (Double.doubleToLongBits(note3) != Double
				.doubleToLongBits(other.note3))
			return false;
		if (Double.doubleToLongBits(note4) != Double
				.doubleToLongBits(other.note4))
			return false;
		if (subject1 == null) {
			if (other.subject1 != null)
				return false;
		} else if (!subject1.equals(other.subject1))
			return false;
		if (subject2 == null) {
			if (other.subject2 != null)
				return false;
		} else if (!subject2.equals(other.subject2))
			return false;
		if (subject3 == null) {
			if (other.subject3 != null)
				return false;
		} else if (!subject3.equals(other.subject3))
			return false;
		if (subject4 == null) {
			if (other.subject4 != null)
				return false;
		} else if (!subject4.equals(other.subject4))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Subject [subject1=" + subject1 + ", subject2=" + subject2
				+ ", subject3=" + subject3 + ", subject4=" + subject4
				+ ", note1=" + note1 + ", note2=" + note2 + ", note3=" + note3
				+ ", note4=" + note4 + "]";
	}
	
}
