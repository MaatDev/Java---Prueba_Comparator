import java.util.Comparator;


public class CompararEdadDescendente implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return -( ( (Integer)o1.getEdad() ).compareTo( (Integer)o1.getEdad() ) );
	}

}
