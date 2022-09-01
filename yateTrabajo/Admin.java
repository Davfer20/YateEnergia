package yateTrabajo;

import java.util.ArrayList;

public class Admin {
	private ArrayList<Bateria> baterias;
	private ArrayList<PanelSolar> paneles;
	private float cargaDisponible;
	private float energiaGenerada;
	private float energiaConsumida;
	private float velocidad1;
	
	
	public Admin () //Puede tener varias baterias
	{

		this.cargaDisponible = 100.0f;
		this.energiaConsumida = 1.0f;
		this.energiaGenerada = 0.0f;
		this.velocidad1 = 0.0f;
		baterias = new ArrayList<Bateria>();
		paneles = new ArrayList<PanelSolar>();
		
	}

	
	public void addPanel() //Se agrega un panel por si nesesita mas energia
	{
		PanelSolar nuevoPanel = new PanelSolar();
		this.paneles.add(nuevoPanel);
	}
	
	public void cargaSolar() // Obtiene la cantidad de carga obtenida
	{
		for (int i = 0; i <paneles.size(); i++)
		{
			PanelSolar panelActual = paneles.get(i);
			this.energiaGenerada =  panelActual.cantidadDeCarga();
		}
		
		
		
	}
	
	public float getVelocidad()

	{
		return velocidad1;
	}	
	
	public void setVelocidad(float pVelocidad)
	{
		this.velocidad1 = pVelocidad;
	}
	
	public void addBateria() //Agrega una nueva bateria al programa
	{	
		Bateria nuevaBate = new Bateria();
		this.baterias.add(nuevaBate);
	}
	
	public void getBateria()
	{
		if (baterias.size() == 1)
		{
			
			Bateria bateriaActual = baterias.get(0);
			this.cargaDisponible = bateriaActual.NivelCarga();
		}
		else
		{ for (int i = 1; i <baterias.size(); i++)
		{
			Bateria bateriaActual = baterias.get(i);
			this.cargaDisponible =  cargaDisponible + bateriaActual.NivelCarga();
			
		}
	}
		this.cargaDisponible = cargaDisponible / baterias.size();
		this.cargaDisponible = cargaDisponible - energiaConsumida + energiaGenerada;
	}
	
	public void velocidad()
	{
		if (velocidad1 == 0)
		{
			this.energiaConsumida = 0;
		}
	else if (velocidad1 <15)
		{
			this.energiaConsumida = 4;
		}
		else if (velocidad1 <30)
		{
			this.energiaConsumida = 8;
		}
		else if (velocidad1 >30)
		{
			this.energiaConsumida = 12;
		}
	}
	
	public float simulacionOn() {
		int i = 1;
		int finContador = 30;
		addBateria();
		addBateria();
		addPanel();
		velocidad();
		while (i<finContador)
		{
			try {
			if (i<10)
			{
				setVelocidad(10);
			}
			else if (i<20)
			{
				setVelocidad(20);
			}
			
			else if (i>20)
			{
				setVelocidad(40);
			}
			velocidad();
			cargaSolar();
			getBateria();
			
			Thread.sleep(1000);
			System.out.println("BateriaGenerada:  "+energiaGenerada);
			System.out.println("Velocidad:  "+velocidad1);
			System.out.println("Nivel de carga:  "+cargaDisponible);
			i++;
			}
			catch (Exception ex) {
				ex.printStackTrace();
		}
		}
		return cargaDisponible;
	}
}


