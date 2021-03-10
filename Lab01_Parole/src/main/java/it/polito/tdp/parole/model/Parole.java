package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Parole {
	
	private List<String> lista;
		
	public Parole() {
		lista = new ArrayList<String>();
	}
	
	public void addParola(String p) {
		lista.add(p);
	}
	
	public List<String> getElenco() {
		return lista;
	}
	
	public void reset() {
		lista.clear();
	}

}
