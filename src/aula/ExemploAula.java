package aula;

import javax.swing.JOptionPane;

public class ExemploAula {

	public static void main(String[] args) {
		
		try {
			String x = JOptionPane.showInputDialog ("Digita um numero ae:");
			int j = Integer.parseInt(x);
			
			while ( j < 10) {
				System.out.println(j);
				j = j + 1;
				
			}

			}catch (Exception e) {
				e.printStackTrace();
				
			}

		
	}
	

}
