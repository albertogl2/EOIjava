package java1;

import java.util.Scanner;

public class HolaMundo {
	//hola albero
	
	private static void iniciacion() {
		//declarar variable que sea numero	
				int numero = 10;
				int numero1 = 5;
				int suma = 0;
				double numero2 = 3.5; //double para decimales
				char letra ='a'; //si un char lo sumas a un número no se concatena , la letras son números ascii
				String cadena = "Esto es una cadena";
				
			//(syso)Para escribir por pantalla y baja a la siguiente
				System.out.println("Hola Mundo");
				/*System.out.println("Adios Mundo Cruel");
				System.out.println("Tercera linea");*/
				System.out.println(numero);
			//suma de numeros + - * / %(para el resto de la división)
				System.out.println(numero/numero1);
				System.out.println(numero2+numero-numero1);
				System.out.println(letra+" "+cadena);//para hacer un espacio
				System.out.println(suma+"\n"+cadena);//para bajar de linea
				System.out.println(letra+numero); //letra es char y coge el numero ascii de a
				System.out.println(suma+"\t"+cadena);//para tabular de uno a otro
				System.out.println("La suma da:" + (numero1+numero));//asi das preferencia a la suma y no concatena
				
				
				double decimales1 = 3.4;
				double decimales2 = 2.5;
				double divisionDecimales = (int) (decimales1 + decimales2);//5
				System.out.println(divisionDecimales);
				double divisionDeciamles2 = (int) decimales1 + decimales2;//5.5
				System.out.println(divisionDeciamles2);
				
				//resultado decimal
				double resultado2 = (7+4)*(2-5.0);// pongo un 5.0 para que el número sea doble o no coja todos y no de error.
				System.out.println(resultado2);
				
				final double IVA = 0.21;//al poner final no puedes cambiar su valor
				int precio = 100;
				System.out.println(precio*IVA);
				System.out.println("La ropa cuesta: " + precio + "\nIVA:" + precio* IVA + "\nTOTAL: " + (precio + (precio*IVA)));
				
				//Preincremento, Postincrementos , Predecrementos , Postdecrementos
				int valor = 10;
				valor++; //11  valor = valor + 1
				valor--;//10
				System.out.println(valor++);//10 primero imprime el valor y luego lo aumenta
				System.err.println(valor++);//11 
				System.out.println(++valor);//13
				System.out.println(valor--);//13
				System.out.println(valor--);//12
				System.out.println(valor);//11
				valor = 10;
				System.out.println(valor++ + ++valor + valor-- - --valor);
				System.out.println(valor);
				
				//Conversiones numero a cadena
				int prefijo = 34;
				int telefono = 666666;
				System.out.println("+"+ prefijo+telefono); //Ambas hacen lo mismo ( 34666666)
				System.out.println(String.valueOf(prefijo) + telefono);
				//Conerviones cadena a numero
				String valor1 = "10";
				
	}
	private static void ejemploConversiones() {
		Scanner sc = new Scanner(System.in);//Scanner para sacar por consola scanner.utils
		//Conversiones numero a cadena
		int prefijo = 34;
		int telefono = 666666;
		System.out.println("+"+ prefijo+telefono); //Ambas hacen lo mismo ( 34666666)
		System.out.println(String.valueOf(prefijo) + telefono);
		
		//Conerviones cadena a numero
		System.out.println("Introduce un valor: ");
		String valor1 = sc.nextLine();
		valor1 =valor1.replace(',', '.');//convertir las comas en puntos
		valor1 = valor1.trim();//quita espacios por delante y por atras
		System.out.println("El número que usted introdujo más 5 da: " + (Integer.parseInt(valor1) + 5));
		System.out.println("El número que usted introdujo más 5 da: " + (Double.parseDouble(valor1) + 5));
		//Integer coge una cadena y devuelve un numero entero y Double es para valor con decimal
		sc.close();
	}
	
	private static void e1() {
		int numero3 = 36;
		int numero4 = 27;
		System.out.println(numero3+numero4);
	}
	private static void e2() {
		int numero3 = 36;
		int numero4 = 27;
		System.out.println(numero3<numero4);//si numero3 es menor
		System.out.println(numero3==numero4);//si son iguales
		System.out.println(numero3>=numero4);//si nunero3 es mayor o igual
	}
	private static void e3() {
		double var1 = 4.5;
		double var2 = 4.6;
		double var3 = 4.7;
		double var4 = 4.8;
		System.out.print(var1);
		System.out.print(var2);
		System.out.print(var3);
		System.out.println(var4);
		System.out.println(var1 + ((var2*var3)/var4));
	}
	private static void e4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int N = sc.nextInt();
		System.out.println("El valor inicial de N es :" + N);
		N += 77;
		System.out.println("El valor incrementado en 77 es:" + N);
		System.out.println("El decremento en 3 es :" + (N - 3));
		System.out.println("La Duplicación de N es:" + (N*N));
		sc.close();
	}
	private static void e5() {
		var A = 2;
		var B = 4;
		var C = 6;
		var D = 8;
		B = C;
		C = A;
		A = D;
		D = B;
		System.out.println(B);
		System.out.println(C);
		System.out.println(A);
		System.out.println(D);
	}
	private static void e6() {
	int numero3 = 36;
	int numero4 = 27;
	System.out.println(numero3+numero4);
	}
	private static void e7() {
	int numero3 = 36;
	int numero4 = 27;
	System.out.println(numero3+numero4);
	}
	private static void e8() {
	int numero3 = 36;
	int numero4 = 27;
	System.out.println(numero3+numero4);
	}
	

	public static void main(String[] args) {
	
		e3();
	}
}
