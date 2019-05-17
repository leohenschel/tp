package model;

public class circulo extends figura {
	private long raio;
	
	
	public long getRaio() {
		return raio;
	}

	public void setRaio(long raio) {
		this.raio = raio;
	}
	
	
	@Override
	public void area () {
		System.out.println(3.14 * raio * raio);
	}
}
