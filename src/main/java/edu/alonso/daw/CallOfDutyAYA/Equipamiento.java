package edu.alonso.daw.CallOfDutyAYA;

import java.util.Objects;

public class Equipamiento {
	private int id;
	private int espaciosEnMochila;

	public Equipamiento(int id, int espaciosEnMochila) {

		this.id = id;
		this.espaciosEnMochila = espaciosEnMochila;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEspaciosEnMochila() {
		return espaciosEnMochila;
	}

	public void setEspaciosEnMochila(int espaciosEnMochila) {
		this.espaciosEnMochila = espaciosEnMochila;
	}

	@Override
	public int hashCode() {
		return Objects.hash(espaciosEnMochila, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipamiento other = (Equipamiento) obj;
		return espaciosEnMochila == other.espaciosEnMochila && id == other.id;
	}

	@Override
	public String toString() {
		return "Equipamiento [id=" + id + ", espaciosEnMochila=" + espaciosEnMochila + "]";
	}

}
