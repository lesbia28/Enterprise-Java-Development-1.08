package control;

import java.math.BigDecimal;
import java.math.RoundingMode;

import model.IntArrayList;
import model.IntVector;
import model.Movie;
import model.Sedan;
import model.Truck;
import model.TvSeries;
import model.UtilityVehicle;

/*
Laboratorio 1.08

1. Usando la documentación de BigDecimal, crea un metodo
que acepte un BigDecimal y devuelva un double del número
Bigdecimal redondeado a la centesima.
Por ejemplo, 4.2545 debe devolver 4.25

2. Usando la documentación de BigDecimal, crea un método
que acepte un BigDecimal, cambie el signo, y redonde el número a 
la decima y devuelva el resultado. Por ejemplo, 1.2354 debería devolver
1.2 y 45.67 devolver 45.7.

3. Supon que estas construyendo un sistema de inventario de 
coches. Todos los coches tiene un vinNumber, marca, modelo, y millas.
Pero un Coche no es solo un coche. Cada coche puede ser un Sedan,
un utilitario o una camioneta. Los utilitarios tiene un booleano que 
representa si tiene tracción a las cuatro ruedas.
Las camionetas tiene un numero indicando la capacidad.
Crea una clase abstracta llamada Car y 3 clases que extiendan de ella, 
llamadas Sedan, UtilityVehicle, and Truck.

4. Supón que estas construyendo un servicio de video por streaming.
Todos los videos son series de tv o peliculas. Crea las clases
TvSeries y Movie las cuales extienden de la clase abstracta Video.
Añade unos metodos y propiedades para cada uno.

5. Crea un interfaz llamada IntList. Una IntList es simplemente una
manera de guardar un lista de enteros de manera ordenada.
IntList debe tener un método de add en el cual un usuario puede añadir
un nuevo numero a la lista de enteros.
Tambien debe tener un metodo get en el cual los usuarios pueden recuperar
un elemento por id.
Necesitas dos implementaciones de IntList.
La primera implementacion es IntArrayList.
Los guardará en un array con una longitud de 10 por defecto.
Cuando el metodo add es llamado, debes determinar si
el array esta lleno. Si esta lleno crea un nuevo array que es
50% mas grande, mueve todos los elementos hacia el nuevo array
y añade el nuevo elemento. (por ejemplo, un array de 10 se incrementará
a 15)

La segunda implementación es un IntVector, este debe guardar numeros
en un array con longitud de 20 por defecto.
Cuando el metodo add es llamado, debes determinar si el array esta lleno.
Si es asi, se debe crear un nuevo array que es el doble del tamaño del actual,
mover todos los elementos hacia el nuevo array y añadir el nuevo elemento.
(por ejemplo, un array de longitud 10 se incrementará a 20)
Debes incluir un ejemplo en el README.md de cual implementacion sería mas eficiente.
*/



public class Main {

	// 1. Metodo redondeo
	private static double round(BigDecimal a) {
		a = a.setScale(2, RoundingMode.HALF_UP);
		return a.doubleValue();
	}
	
	// 2. Metodo cambiar signo y redondear a la decima
	private static double reverseAndRoundTenth(BigDecimal a) {
		a = a.negate();
		a = a.setScale(1, RoundingMode.HALF_UP);
		return a.doubleValue();
	}
	
	
	public static void main(String[] args) {
		// 1. Metodo redondeo
		BigDecimal a = new BigDecimal(4.2545);
		System.out.println(a);
		System.out.println(round(a));
		
		// 2. Metodo cambiar signo y redondear a la decima
		BigDecimal a2=new  BigDecimal(1.2345);
		BigDecimal a3= new BigDecimal(-45.67);
		System.out.println(a2);
		System.out.println(reverseAndRoundTenth(a2));
		System.out.println(a3);
		System.out.println(reverseAndRoundTenth(a3));
		
		//3. Sistema de Invetario de Coches
		Sedan model3=new Sedan(123456789,"Tesla","Model 3",1000);
		System.out.println(model3);
		UtilityVehicle corsa=new UtilityVehicle(123456788, "Opel", "Corsa", 150000, false);
		System.out.println(corsa);
		Truck hilux=new Truck(132456789, "Toyota","Hilux",10000,700);
		System.out.println(hilux);
		
		//4. Servicio de Video por Streaming
		Movie inTime=new Movie("In Time","Action","Andrew Niccol",109);
		System.out.println(inTime);
		TvSeries laValla=new TvSeries("La Valla","Distópica",1,1);
		System.out.println(laValla);
		
		
		//5. Lista de enteros
		IntArrayList t=new IntArrayList();
		for(int i=0;i<16;i++) {
			t.add(i);
		}
		System.out.println(t.getLengthArray());
		System.out.println(t);
		
		IntVector t2=new IntVector();
		for(int i=0;i<21;i++) {
			t2.add(i);
		}
		System.out.println(t2.getLengthArray());
		System.out.println(t2);

		
		IntArrayList primero=new IntArrayList();
		double t1_1=System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			primero.add(i);
		}
		double t1_2=System.currentTimeMillis();
		
		IntVector segundo=new IntVector();
		
		double t2_1=System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			segundo.add(i);
		}
		double t2_2=System.currentTimeMillis();

		
		System.out.println("Primero: "+(t1_2-t1_1));
		System.out.println("Segundo: "+(t2_2-t2_1));
		

		

	}

}
