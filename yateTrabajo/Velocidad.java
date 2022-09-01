package yateTrabajo;

public class Velocidad {
		private float velocidad;
		private float consumoKw;
		
		public boolean encenderM;
		
		public Velocidad ()
		{
			velocidad = 0.0f;
			consumoKw = 1.0f;
			encenderM = true;
		}
		
		public float amountSpeed()
		{
			return velocidad;
		}
		
		public void setVelocidad(float pVelocidad)
		{
			this.velocidad = pVelocidad;
		}
		
		public void setcConsumo(float pConsumo)
		{
			consumoKw = pConsumo;
		}
		
	
}


