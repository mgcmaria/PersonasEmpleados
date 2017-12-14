package Act15_MariaGCarballo;

public abstract class Empleado extends Persona{
		
	//Variables definidas en el ejercicio 12
	private String Idpersonal;
	private float sueldo;
	
	//Constructor de empleado m�s lo que hereda de persona sin par�metros
	public Empleado() 
	{
		super();		
		super.isbCasado();
		this.setIdpersonal("0001");
		this.setSueldo(1200);
	}
	
	//Constructor de empleado m�s lo que hereda de persona con par�metros
	public Empleado(String nombre, byte edad, char sexo, String DNI, 
			boolean bCasado,String Idpersonal, float sueldo)
	{
		super(nombre, edad, sexo, DNI, bCasado);
		this.setIdpersonal(Idpersonal);
		this.setSueldo(sueldo);
	}	

	//M�todos abstractos
	public abstract float calcularAntiguedadMensual();
	public abstract float calcularComplementosMensuales();
	
	//M�todos Getter y Setter
	public String getIdpersonal() {
		return Idpersonal;
	}
	public void setIdpersonal(String idpersonal) {
		Idpersonal = idpersonal;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
}
