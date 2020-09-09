package br.com.matriz;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
	
	public static void main(String[] args) {
		
		String text = "Wanderléa, Java, 80, 70, 90, 89";
		String[] valorArray = text.split(",");
		
		for (int i = 0; i < valorArray.length; i ++) {
			System.out.println(valorArray[i]);
		}
		
		/*Convertendo um array em uma lista*/
		List<String> list = Arrays.asList(valorArray);
		
		for (String valorString : list) {
			System.out.println(valorString);
		}
		
		/*Convertendo um lista em uma array*/
		String[] conversoaArray = list.toArray(new String[6]);
		for (int i = 0; i < conversoaArray.length; i ++) {
			System.out.println(valorArray[i]);
		}
	}
}
