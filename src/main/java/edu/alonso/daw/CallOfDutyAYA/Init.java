package edu.alonso.daw.CallOfDutyAYA;

public class Init {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("MENU DE SELECCIÓN\n-----------------");
		System.out.println("1-Mostrar Inventario");
		System.out.println("2-Añadir Armas");
		System.out.println("3-Añadir Accesorios");
		System.out.println("4-Equipar Inventario");
		System.out.println("5-Desquipar Inventario");
		System.out.println("6-Salir");

		int opt;
		do {
			System.out.println("\nSelecciona una opción:");
			opt = sc.nextInt();

			switch (opt) {
			case 1:
				// Metodo Mostrar inventario
				break;
			case 2:
				// Añadir arma principal y arma secundaria
				break;
			case 3:
				// Añadir accesorios
				break;
			case 4:
				// Equipar el inventario anteriormente creado
				break;
			case 5:
				// Desquipar el inventario anteriormente creado
				break;
			case 6:
				// Salir
				break;
			}
		} while (opt != 6);
		sc.close();
	}
}
