package ejercicio2;

public class Viaje {

	public String origen, destino;
	public double distancia;
	
	public Viaje(String origen, String destino, double distancia) {
		this.origen = origen;
		this.destino = destino;
		this.distancia = distancia;
	}
	
	public Viaje uneViaje(Viaje origen, Viaje destino){
		
		Viaje viaje;
		if(!origen.origen.equals(destino.destino)){
			viaje = new Viaje(origen.origen, destino.destino, origen.distancia+destino.distancia);
		}else{
			viaje = new Viaje(origen.origen, destino.destino, -1);
		}
		return viaje;
	}
		
}
