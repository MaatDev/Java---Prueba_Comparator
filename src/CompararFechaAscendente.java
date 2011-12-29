import java.util.Comparator;


public class CompararFechaAscendente implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getFecha().compareTo(o2.getFecha());
	}

}
