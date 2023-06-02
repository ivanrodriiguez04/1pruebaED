package servicios;

import java.util.Scanner;

import entidades.datos;

public class implementacionDNI implements interfazDNI {
	
	
	datos Datos=new datos();
	Scanner sc = new Scanner(System.in);
	@Override
	public void pedirNumero()
	{
	
		System.out.println("Introduzca los numero de su DNI:");
		Datos.setNumeroDNI(sc.nextInt());
		
	}
	@Override
	public void calcularLetra() 
	{
		int opcion=Datos.getNumeroDNI()%23;
		switch(opcion) 
		{
		case 0:
			System.out.println("La letra asignada para su DNI es la T");
			break;
		case 1:
			System.out.println("La letra asignada para su DNI es la R");
			break;
		case 2:
			System.out.println("La letra asignada para su DNI es la W");
			break;
		case 3:
			System.out.println("La letra asignada para su DNI es la A");
			break;
		case 4:
			System.out.println("La letra asignada para su DNI es la G");
			break;
		case 5:
			System.out.println("La letra asignada para su DNI es la M");
			break;
		case 6:
			System.out.println("La letra asignada para su DNI es la Y");
			break;
		case 7:
			System.out.println("La letra asignada para su DNI es la F");
			break;
		case 8:
			System.out.println("La letra asignada para su DNI es la P");
			break;
		case 9:
			System.out.println("La letra asignada para su DNI es la D");
			break;
		case 10:
			System.out.println("La letra asignada para su DNI es la X");
			break;
		case 11:
			System.out.println("La letra asignada para su DNI es la B");
			break;
		case 12:
			System.out.println("La letra asignada para su DNI es la N");
			break;
		case 13:
			System.out.println("La letra asignada para su DNI es la J");
			break;
		case 14:
			System.out.println("La letra asignada para su DNI es la Z");
			break;
		case 15:
			System.out.println("La letra asignada para su DNI es la S");
			break;
		case 16:
			System.out.println("La letra asignada para su DNI es la Q");
			break;
		case 17:
			System.out.println("La letra asignada para su DNI es la V");
			break;
		case 18:
			System.out.println("La letra asignada para su DNI es la H");
			break;
		case 19:
			System.out.println("La letra asignada para su DNI es la L");
			break;
		case 20:
			System.out.println("La letra asignada para su DNI es la C");
			break;
		case 21:
			System.out.println("La letra asignada para su DNI es la K");
			break;
		case 22:
			System.out.println("La letra asignada para su DNI es la E");
			break;
		default:
			break;
		}
	}



}
