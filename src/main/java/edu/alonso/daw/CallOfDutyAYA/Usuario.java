package edu.alonso.daw.CallOfDutyAYA;

import java.util.Objects;

public class Usuario {
	private String nombre;
	private int espaciosMochila;
	private Arma armaPrincipal;
	private Arma armaSecundaria;
	private Accesorio[] accesorios;

	public Usuario(String nombre, int espaciosMochila, Arma armaPrincipal, Arma armaSecundaria, Accesorio accesorios[]) {
		this.nombre = nombre;
		this.espaciosMochila = espaciosMochila;
		this.armaPrincipal = armaPrincipal;
		this.armaSecundaria = armaSecundaria;
		this.accesorios = accesorios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEspaciosMochila() {
		return espaciosMochila;
	}

	public void setEspaciosMochila(int espaciosMochila) {
		this.espaciosMochila = espaciosMochila;
	}

	public Arma getArmaPrincipal() {
		return armaPrincipal;
	}

	public void setArmaPrincipal(Arma armaPrincipal) {
		this.armaPrincipal = armaPrincipal;
	}

	public Arma getArmaSecundaria() {
		return armaSecundaria;
	}

	public void setArmaSecundaria(Arma armaSecundaria) {
		this.armaSecundaria = armaSecundaria;
	}



	public Accesorio[] getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(Accesorio[] accesorios) {
		this.accesorios = accesorios;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accesorios, armaPrincipal, armaSecundaria, espaciosMochila, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(accesorios, other.accesorios) && Objects.equals(armaPrincipal, other.armaPrincipal)
				&& Objects.equals(armaSecundaria, other.armaSecundaria) && espaciosMochila == other.espaciosMochila
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", espaciosMochila=" + espaciosMochila + ", armaPrincipal=" + armaPrincipal
				+ ", armaSecundaria=" + armaSecundaria + ", accesorios=" + accesorios + "]";
	}

}
