//Wanderléa Lodi
//07/03/2016

package br.com.exemplos;

import javax.swing.JOptionPane;

public class DataEntryAndConversion {
	
	public static void main(String[] args) {
		
		String cars = JOptionPane.showInputDialog("Enter the number of cars?");
		String people = JOptionPane.showInputDialog("Enter the number of people?");
		
		//String to double
		double carNumber = Double.parseDouble(cars);
		double peopleNumber = Double.parseDouble(people);
		
		//Double to int
		int div = (int) (carNumber/peopleNumber);
		
		double rest = carNumber % peopleNumber;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Do you want to see the outcome of the devision?");
		
		if (resposta == 0)
			JOptionPane.showMessageDialog(null, "Cars per person " + div + " you still got " + (int) rest + " car.");
		
		
	}

}
