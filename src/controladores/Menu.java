package controladores;

import servicios.implementacionDNI;
import servicios.interfazDNI;

public class Menu {

	public static void main(String[] args) {
		// Iniciamos las interfaces
		interfazDNI iD= new implementacionDNI();
		//Llamamos al metodo de pedir el numero
		iD.pedirNumero();
		//Llamamos al metodo de calcular la letra
		iD.calcularLetra();
		
	}

}
