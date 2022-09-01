package yateTrabajo;

public class Bateria {
	private float carga;
	private boolean charging;
	public boolean enable;
	
	//Acciones 
	public Bateria()
	{
		carga = 100.0f;
		charging = false;
		enable = true;
		
	}
	public void enableBat ()
	{
		enable = true;
	}
	
	public void Charge ()
	{
		this.charging = true;
	}
	
	public void Disconect ()
	{
		this.charging = false;
	}
	
	public float NivelCarga ()
	{
		return this.carga;
	}
	
	public void SetNivelCarga (float pCarga)
	{
		this.carga = pCarga;
	}

	
}
