import java.util.Date;


public class Persona {

	private String nombre;
	private int edad;
	private Date fecha;
	
	public Persona(String nombre, int edad, Date fecha){
		this.nombre = nombre;
		this.edad = edad;
		this.fecha = fecha;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
}
