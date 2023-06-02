package entidades;

public class datos {
	
	//Atributos
	private int numeroDNI=0;
	private char letraAsignada;
	

	//Getters & Setters
	public int getNumeroDNI() {
		return numeroDNI;
	}

	public void setNumeroDNI(int numeroDNI) {
		this.numeroDNI = numeroDNI;
	}
	public char getLetraAsignada() {
		return letraAsignada;
	}

	public void setLetraAsignada(char letraAsignada) {
		this.letraAsignada = letraAsignada;
	}
	@Override
	public String toString() 
	{
		return "datos [numeroDNI="+numeroDNI+"Letra Aignada= "+letraAsignada+"]";
	}
	
	

}
