package Act15_MariaGCarballo;

public class Persona {
	
	//Variables de la clase Persona
	private String nombre;
	private byte edad;
	private char sexo;
	private String DNI;
	private boolean bCasado=false;
	
	//Constructor de la clase sin parámetros
	
	public Persona()
	{
		this.setNombre("Juan");
		this.setEdad((byte) 35);
		this.setSexo((char) 'M');
		this.setDNI("123456789L");
		this.setbCasado(false);
	}
	
	//Constructor de la clase con parámetros
	public Persona(String nombre,byte edad, char sexo, String DNI, boolean bCasado)
	{
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setSexo(sexo);
		this.setDNI(DNI);
		this.setbCasado(bCasado);
	}
		
	//método toString() de la clase Persona
	public String toString()
	{
		return ("La persona " + this.getNombre() + " de "+ this.getEdad() + 
				" años de edad y sexo "+ this.getSexo()+ " con DNI: "+ this.getDNI() + 
				"y su estado de casado es: "+ this.isbCasado());
	}
			
	//Métodos Getter y Setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public boolean isbCasado() {
		return bCasado;
	}

	public void setbCasado(boolean bCasado) {
		this.bCasado = bCasado;
	}

}
