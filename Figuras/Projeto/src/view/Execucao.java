package view;

import model.circulo;
import model.quadrado;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circulo circ = new circulo();
		quadrado quad = new quadrado();
		
		circ.setRaio(8);
		quad.setLado(3);
		
		circ.area();
		quad.area();
	}

}