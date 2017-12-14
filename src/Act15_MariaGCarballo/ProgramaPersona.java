package Act15_MariaGCarballo;

import java.util.*;

public class ProgramaPersona {

	public static void main(String[] args) {
			
		Persona persona = new Persona();
		Obrero obrero = new Obrero();
		Tecnico tecnico = new Tecnico();
		int aleatorio1 = (int) Math.random(); //variable aleatoria1
		int aleatorio2 = (int) Math.random(); //variable aleatoria2
								
		System.out.println("Probamos los métodos toString de cada tipo de persona");
		System.out.println(persona);
		System.out.println(obrero);
		System.out.println(tecnico);
		System.out.println("------------------------------------");
	
		//Creamos un Array List de personas
		ArrayList<Persona> listapersonas = new ArrayList<Persona>();
		
		System.out.println("Mostramos los tipos de persona que se van crear:");
		
		for(int i=0; i<(aleatorio1=(int)(Math.random()*20)); i++)
		{
			aleatorio2=(int)(Math.random()*3);
			//System.out.println("El objeto a crear: "+aleatorio2);
			if (aleatorio2==0) {
				listapersonas.add(new Persona());	
				System.out.println("El objeto a crear es persona");
			}
			if (aleatorio2==1) {
				listapersonas.add(new Obrero());	
				System.out.println("El objeto a crear es obrero");
			}
			if (aleatorio2==2) {
				listapersonas.add(new Tecnico());	
				System.out.println("El objeto a crear es tecnico");
			}
		}
		
		System.out.println("-------------------------");	
		System.out.println("El tamaño del array es: " + listapersonas.size());
		System.out.println("-------------------------");	
		
		//Imprimimos la lista de personas que se han creado
		for (Persona fig: listapersonas)
		{
			System.out.println(fig);	
		} 	
		
		System.out.println("-------------------------");	
		System.out.println("El sueldo de obrero con " + obrero.getTrienios()+ " trienios es: " +
		obrero.calcularAntiguedadMensual());
		
		if (obrero.getTurno()=='N')
			System.out.println("El sueldo de obrero con complemneto de nocturnidad es: " + 
			obrero.calcularComplementosMensuales());
		
		System.out.println("-------------------------");	
		System.out.println("El sueldo de tecnico con " + tecnico.getQuinquenios() + " quinquenios es: " +
		tecnico.calcularAntiguedadMensual());
		System.out.println("El sueldo de tecnico con complemntos es: " + tecnico.calcularComplementosMensuales());
				
}
}
