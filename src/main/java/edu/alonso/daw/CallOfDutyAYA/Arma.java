package edu.alonso.daw.CallOfDutyAYA;

import java.util.Objects;

public class Arma extends Equipamiento  {
	private String nombre;


	
	public Arma(int id, int espaciosEnMochila,String nombre) {
		super(id, espaciosEnMochila);
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nombre);
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
		Arma other = (Arma) obj;
		return Objects.equals(nombre, other.nombre);
	}


	@Override
	public String toString() {
		return "Arma [nombre=" + nombre + ", espacio="+ "]";
	}

}
