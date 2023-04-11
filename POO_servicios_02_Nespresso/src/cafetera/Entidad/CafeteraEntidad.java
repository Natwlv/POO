package cafetera.Entidad;

public class CafeteraEntidad {

		private int capacidadMaxima;
		private int cantidadActual;
		
		
		public CafeteraEntidad() {
			
		}
		
		public CafeteraEntidad(int capacidadMaxima, int cantidadActual) {
			this.capacidadMaxima = capacidadMaxima;
			this.cantidadActual = cantidadActual;
			
		}

		public void setCapacidadMaxima(int capacidadMaxima) {
			this.capacidadMaxima = capacidadMaxima;
		}

		public void setCantidadActual(int cantidadActual) {
			this.cantidadActual = cantidadActual;
		}

		public int getCapacidadMaxima() {
			return capacidadMaxima;
		}

		public int getCantidadActual() {
			return cantidadActual;
		}
		
		
		
}
