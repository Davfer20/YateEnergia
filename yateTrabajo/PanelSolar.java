package yateTrabajo;

import java.util.Random;



public class PanelSolar {
	private float potenciaSol;
	private float cantidadCarga;
	private int poderCarga;
	
	public boolean encender;
	
	public PanelSolar()
	{
		potenciaSol = 10.0f;
		cantidadCarga = 0.05f;
		poderCarga = 2;
		encender = true;
		
	}
	public void enablePanel()
	{
		this.encender = true;
	}
	
	public void setPotenciaCarga(int pPotencia)
	{
		this.poderCarga = pPotencia; //El sol tiene el poder de cargar x cantidad
	}
	
	public void setPotenciaSol(float pPorcentajeSol)
	{
		this.potenciaSol = pPorcentajeSol;
	}
	
	public void gradoSolar()
	{
		int i = 0;
		int finContador = 30;
		float cantidadCargaTemporal = cantidadCarga;
		while (i<finContador) //Solo se simula por 30 seg
		{
			try {
				
				cantidadCargaTemporal = (potenciaSol * poderCarga)/100;
				Thread.sleep(1000);
				System.out.println("Nivel de carga:  "+cantidadCargaTemporal);
				
				i++;
				if (i<(finContador/2))
				{
					setPotenciaSol(potenciaSol*2);
				}
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
			this.cantidadCarga = cantidadCargaTemporal;
		}
	}
	
	public float cantidadDeCarga()
	{	
		Random r = new Random();
		int valorDado = r.nextInt(10)+1;
		
		float potenciaSol = valorDado*10;
		setPotenciaSol(2);
		
		float cantidadCargaTemp = cantidadCarga;
		cantidadCargaTemp = (potenciaSol*poderCarga)/100;
		return cantidadCargaTemp;
	}

}
