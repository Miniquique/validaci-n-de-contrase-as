package cadenasDeCaracteres;

import java.util.Scanner;

public class validacionDeContraseñas {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		boolean valido = false;
		String especiales = "@#$%&";
		boolean tamañoC = true;
		boolean mayuscula = false;
		boolean caracterS = false;
		boolean numero = false;
		String contraseña = "";


		do {
			//se necesita para que no se borren las variables
			tamañoC = true;
			mayuscula = false;
			caracterS = false;
			numero = false;
			
			System.out.println("introduce la contraseña");
			contraseña = sc.nextLine();
			int tamaño = contraseña.length();
			if (!contraseña.equals(contraseña.toLowerCase())) {
				mayuscula = true;
			}
			if (tamaño < 8 || tamaño > 20)
				tamañoC = false;

			for (int i = 0; i <= tamaño - 1; i++) {
				char caracter = contraseña.charAt(i);
				String car = String.valueOf(caracter);
				
				if (Character.isDigit(caracter)) {
			        numero = true;
			    }
				if (especiales.contains(car)) {
					caracterS = true;
				}
				if (caracterS && numero && mayuscula)
					break;

			}
			if (caracterS && numero && mayuscula && tamañoC) {
				System.out.println("contraseña registrada correctamente");
				valido = true;
			} else
				System.out.println("la contraseña debe cumplir los requisitos de seguridad");
		} while (!valido);
		sc.close();
	}

}
