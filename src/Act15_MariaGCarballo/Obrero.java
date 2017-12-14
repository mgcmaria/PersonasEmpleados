package Act15_MariaGCarballo;

public class Obrero extends Empleado {
	
	private byte trienios;
	private char turno;
	
	public Obrero() 
	{
		super();
		this.setTrienios((byte) 5);
		this.setTurno((char) 'N');
	}
	
	public Obrero (String nombre,byte edad,char sexo,String DNI,boolean bcasado,
			String Idpersonal,float sueldo,byte trienios,char turno)
	{
		super(nombre,edad,sexo,DNI,bcasado,Idpersonal,sueldo);
		this.setTrienios(trienios);
		this.setTurno(turno);		
	}
	
	@Override
	public float calcularAntiguedadMensual() {
		
		if (getTrienios()!=0)
			setSueldo((this.getSueldo()*getTrienios()/100)+getSueldo());
		return getSueldo();
	}

	@Override
	public float calcularComplementosMensuales() {
		
		if (getTurno()=='N')
			setSueldo(this.getSueldo()*3/100);
		return getSueldo();
	}
	
	public String toString()
	{
		return ("La persona " + this.getNombre() + " de "+ this.getEdad() + 
				" a�os de edad y sexo "+ this.getSexo()+ " con DNI: "+ this.getDNI() + 
				"y su estado de casado es: "+ this.isbCasado()+" tiene el Idempleado "+
				this.getIdpersonal()+" y un sueldo de: "+this.getSueldo()+" euros."
				+" Adem�s tiene "+this.trienios+" trienios y turno de "+this.turno);
	}

	//M�todos Getter y Setter
	public byte getTrienios() {
		return trienios;
	}
	public void setTrienios(byte trienios) {
		this.trienios = trienios;
	}
	public char getTurno() {
		return turno;
	}
	public void setTurno(char turno) {
		this.turno = turno;
	}
}
