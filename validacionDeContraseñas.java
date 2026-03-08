package cadenasDeCaracteres;

import java.util.Scanner;

public class validacionDeContraseñas {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		
		String contraseña = sc.nextLine();
		int tamaño = contraseña.length();
		String especiales = "@#$%&";
		boolean tamañoC = true;
 		boolean mayuscula = false;
		boolean caracterS = false;
		boolean numero = false;
		
		if (!contraseña.equals(contraseña.toLowerCase())){
			mayuscula = true;
		}
		if (tamaño<8||tamaño>20)tamañoC = false;
		
		for (int i=0;i<=tamaño-1;i++) {
			char caracter= contraseña.charAt(i);
			String car= String.valueOf(caracter);
			switch(caracter){
				case '1','2','3','4','5','6','7','8','9','0'-> numero=true; 
			}
			if(especiales.contains(car)) {
				caracterS=true;
			}
			if(caracterS&&numero&&mayuscula)break;
				
		}
		if(caracterS&&numero&&mayuscula&&tamañoC) {
			System.out.println("contraseña registrada correctamente");
		}else System.out.println("la contraseña debe cumplir los requisitos de seguridad");
		sc.close();
	}

}
