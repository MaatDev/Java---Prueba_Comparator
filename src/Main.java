import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class Main {

	
	public static void main(String [] args){
		
		ArrayList<Persona> personas = getPersonas();
			
		mostrarPersonas(personas,new CompararNombreAscendente());
			
		mostrarPersonas(personas, new CompararNombreDescendente());
				
		mostrarPersonas(personas, new CompararEdadAscendente());
			
		mostrarPersonas(personas, new CompararEdadDescendente());
			
		mostrarPersonas(personas, new CompararEdadDescendente());		
			
		mostrarPersonas(personas, new CompararFechaAscendente());
		
		mostrarPersonas(personas, new CompararFechaDescendente());
		
	}
	
	private static void mostrarPersonas(ArrayList<Persona> personas, Comparator<Persona> comparador ){
		System.out.println(comparador.getClass().getSimpleName());	
		Collections.sort(personas, comparador);	
		System.out.println("Inicio--------------------------------");
		
		for(Persona persona: personas){
			System.out.println(persona.getNombre()+" | "+persona.getEdad()+" | "+persona.getFecha());
		}		
		
		System.out.println("Fin-----------------------------------");
		
	}
	
	private static ArrayList<Persona> getPersonas(){
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			personas.add(new Persona("Pedro", 14, format.parse("14/2/1931")));
			personas.add(new Persona("Juan", 52, format.parse("15/2/1931")));
			personas.add(new Persona("Miguel", 13, format.parse("14/3/1931")));
			personas.add(new Persona("Juan Carlos", 1, format.parse("14/2/1911")));
			personas.add(new Persona("José", 5, format.parse("14/7/1931")));
			personas.add(new Persona("Manuel", 82, format.parse("24/2/1931")));
			personas.add(new Persona("Oscar", 2, format.parse("14/2/191")));
			personas.add(new Persona("Jorge", 8, format.parse("1/7/1931")));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return personas;
		
	}
	
	
}
