package edu.alonso.daw.CallOfDutyAYA;

import java.util.Objects;

public class ArmaSecundaria extends Arma{
	private int longitudFilo;
	




	public ArmaSecundaria(int id, int espaciosEnMochila, String nombre) {
		super(id, espaciosEnMochila, nombre);
		
	}


	public int getLongitudFilo() {
		return longitudFilo;
	}


	public void setLongitudFilo(int longitudFilo) {
		this.longitudFilo = longitudFilo;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(longitudFilo);
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
		ArmaSecundaria other = (ArmaSecundaria) obj;
		return longitudFilo == other.longitudFilo;
	}


	@Override
	public String toString() {
		return "ArmaSecundaria [longitudFilo=" + longitudFilo + "]";
	}
	

}
