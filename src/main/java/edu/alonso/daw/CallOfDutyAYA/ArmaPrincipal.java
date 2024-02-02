package edu.alonso.daw.CallOfDutyAYA;

import java.util.Objects;

public class ArmaPrincipal extends Arma {
	private String tipo;
	private int municion;
	private String tipoRecarga;

	
	public ArmaPrincipal(int id, int espaciosEnMochila, String nombre) {
		super(id, espaciosEnMochila, nombre);
		
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getMunicion() {
		return municion;
	}
	public void setMunicion(int municion) {
		this.municion = municion;
	}
	public String getTipoRecarga() {
		return tipoRecarga;
	}
	public void setTipoRecarga(String tipoRecarga) {
		this.tipoRecarga = tipoRecarga;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(municion, tipo, tipoRecarga);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArmaPrincipal other = (ArmaPrincipal) obj;
		return municion == other.municion && Objects.equals(tipo, other.tipo)
				&& Objects.equals(tipoRecarga, other.tipoRecarga);
	}
	@Override
	public String toString() {
		return "ArmaPrincipal [tipo=" + tipo + ", municion=" + municion + ", tipoRecarga=" + tipoRecarga + "]";
	}
	
	

}
