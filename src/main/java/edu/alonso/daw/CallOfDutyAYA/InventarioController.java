package edu.alonso.daw.CallOfDutyAYA;

import java.util.Arrays;

public class InventarioController {
	private ArmaPrincipal[] ArmaPrincipal;
	private ArmaSecundaria[] ArmaSecundaria;
	private Accesorio[] accesorios;
	
	public InventarioController(edu.alonso.daw.CallOfDutyAYA.ArmaPrincipal[] armaPrincipal,
			edu.alonso.daw.CallOfDutyAYA.ArmaSecundaria[] armaSecundaria, Accesorio[] accesorios) {
		ArmaPrincipal = armaPrincipal;
		ArmaSecundaria = armaSecundaria;
		this.accesorios = accesorios;
	}

	public ArmaPrincipal[] getArmaPrincipal() {
		return ArmaPrincipal;
	}

	public void setArmaPrincipal(ArmaPrincipal[] armaPrincipal) {
		ArmaPrincipal = armaPrincipal;
	}

	public ArmaSecundaria[] getArmaSecundaria() {
		return ArmaSecundaria;
	}

	public void setArmaSecundaria(ArmaSecundaria[] armaSecundaria) {
		ArmaSecundaria = armaSecundaria;
	}

	public Accesorio[] getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(Accesorio[] accesorios) {
		this.accesorios = accesorios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(ArmaPrincipal);
		result = prime * result + Arrays.hashCode(ArmaSecundaria);
		result = prime * result + Arrays.hashCode(accesorios);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InventarioController other = (InventarioController) obj;
		return Arrays.equals(ArmaPrincipal, other.ArmaPrincipal) && Arrays.equals(ArmaSecundaria, other.ArmaSecundaria)
				&& Arrays.equals(accesorios, other.accesorios);
	}

	@Override
	public String toString() {
		return "InventarioController [ArmaPrincipal=" + Arrays.toString(ArmaPrincipal) + ", ArmaSecundaria="
				+ Arrays.toString(ArmaSecundaria) + ", accesorios=" + Arrays.toString(accesorios) + "]";
	}
	

}
