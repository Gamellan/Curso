package ejercicio1;

public class Empleado {

	private String nif;
	private double sueldo, pagoHorasExtras;
	private int numeroHijos, horasExtrasRealizadas, porcentajeIRPF;

	public Empleado(String nif, double sueldo, double pagoHorasExtras, int horasExtrasRealizadas, int porcentajeIRPF,
			int numeroHijos) {
		this.nif = nif;
		this.sueldo = sueldo;
		this.pagoHorasExtras = pagoHorasExtras;
		this.horasExtrasRealizadas = horasExtrasRealizadas;
		this.porcentajeIRPF = porcentajeIRPF;
		this.numeroHijos = numeroHijos;
	}

	public double calculoHorasExtras() {
		return horasExtrasRealizadas * pagoHorasExtras;
	}

	public double calculoSueldoBruto() {
		sueldo += calculoHorasExtras();
		return sueldo;
	}

	public double calculoRetencionesIRPF() {
		double retenido = 0;
		if (numeroHijos > 2) {
			retenido = (calculoSueldoBruto() * (porcentajeIRPF - 2)) / 100;
		} else if (numeroHijos > 0) {
			retenido = (calculoSueldoBruto() * (porcentajeIRPF - 1)) / 100;
		} else {
			retenido = (calculoSueldoBruto() * porcentajeIRPF) / 100;
		}
		return retenido;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getPagoHorasExtras() {
		return pagoHorasExtras;
	}

	public void setPagoHorasExtras(double pagoHorasExtras) {
		this.pagoHorasExtras = pagoHorasExtras;
	}

	public int getHorasExtrasRealizadas() {
		return horasExtrasRealizadas;
	}

	public void setHorasExtrasRealizadas(int horasExtrasRealizadas) {
		this.horasExtrasRealizadas = horasExtrasRealizadas;
	}

	public int getPorcentajeIRPF() {
		return porcentajeIRPF;
	}

	public void setPorcentajeIRPF(int porcentajeIRPF) {
		this.porcentajeIRPF = porcentajeIRPF;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	@Override
	public String toString() {
		return "NIF= " + nif + "\nsueldo= " + sueldo + "\nPago por las horas extras= " + pagoHorasExtras
				+ "\nHoras extras realizadas este mes= " + horasExtrasRealizadas + "\nPorcentaje del IRPF= "
				+ porcentajeIRPF + "\nNumero de hijos= " + numeroHijos;
	}

}
