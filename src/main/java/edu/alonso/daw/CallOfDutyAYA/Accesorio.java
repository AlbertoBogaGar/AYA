package edu.alonso.daw.CallOfDutyAYA;

import java.util.Objects;

public class Accesorio extends Equipamiento {
	private String tipo; //Aturdidora o granada

	public Accesorio(int id, int espaciosEnMochila) {
		super(id, espaciosEnMochila);
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tipo);
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
		Accesorio other = (Accesorio) obj;
		return Objects.equals(tipo, other.tipo);
	}

	@Override
	public String toString() {
		return "Accesorio [tipo=" + tipo + "]";
	}
	
	

}
