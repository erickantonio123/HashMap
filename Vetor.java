package com.erick;

import java.util.HashMap;

public class Vetor {
	
		
	
	
public static void main (String []args) {
	
	HashMap<String, Integer> mapaIdades = new HashMap<>();	
	
	mapaIdades.put("Alice", 7);
	
	
	String nome ="Alice";
	int idade = mapaIdades.get(nome);
	System.out.println(nome+ " Tem " + idade + " anos ");
	
	
	String nomeverificar = "Alice";
	
	if(mapaIdades.containsKey(nomeverificar)) {
		System.out.println(nomeverificar + " esta no sistema");
	}else {
		System.out.println( nomeverificar + " Não esta no sistema");
	}
	
	
	
	
}
}
