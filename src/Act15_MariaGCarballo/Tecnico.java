package Act15_MariaGCarballo;

public class Tecnico extends Empleado {
	
	private float complemento;
	private byte quinquenios;
	
	public Tecnico()
	{
		super();
		this.setComplemento(500);
		this.setQuinquenios((byte) 2);
	}
	
	public Tecnico (String nombre,byte edad,char sexo,String DNI,boolean bcasado,
			String Idpersonal,float sueldo,float complemento,byte quinquenios)
	{
		super(nombre,edad,sexo,DNI,bcasado,Idpersonal,sueldo);
		this.setComplemento(complemento);
		this.setQuinquenios(quinquenios);
	}

	@Override
	public float calcularAntiguedadMensual() {
		if (getQuinquenios()!=0)
			setSueldo((this.getSueldo()*getQuinquenios()/100)+getSueldo());
		return getSueldo();
	}

	@Override
	public float calcularComplementosMensuales() {
		if (getComplemento()!=0)
			setSueldo(this.getSueldo()*this.getComplemento()/1000+getSueldo());
		return getSueldo();
	}
	
	public String toString()
	{
		return ("La persona " + this.getNombre() + " de "+ this.getEdad() + 
				" años de edad y sexo "+ this.getSexo()+ " con DNI: "+ this.getDNI() + 
				"y su estado de casado es: "+ this.isbCasado()+" tiene el Idempleado "+
				this.getIdpersonal()+" y un sueldo de: "+this.getSueldo()+" euros."
				+" Además tiene "+this.complemento+" de complemneto y "+this.quinquenios+
				" quinquenios.");
	}

	//Métodos Getter y Setter
	public float getComplemento() {
		return complemento;
	}
	public void setComplemento(float complemento) {
		this.complemento = complemento;
	}
	public byte getQuinquenios() {
		return quinquenios;
	}
	public void setQuinquenios(byte quinquenios) {
		this.quinquenios = quinquenios;
	}
}
