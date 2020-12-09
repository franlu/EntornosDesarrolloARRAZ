package debug;

public class invertir_array {
	public invertir_array() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// declaramos array a invertir y la variable que nos va a servir para intercambiar los valores del array
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int aux = 0;
		// imprimimos array para comprobar
		int longitud = array.length -1;
		for (int i = 0; i <= longitud; i++)
			System.out.print(array[i] + " ");
		// invertimos array recorriéndolo hasta la mitad e intercambiando valores
		for (int i = 0; i <= longitud / 2; i++) {
			//vamos guardando la posición que vamos a intercambiar desde el final
			aux = array[longitud - i];
			// como ya tenemos guardada la posición longiutd-i-1, ya podemos guardar en esa
			// posición un valor
			array[longitud - i] = array[i];
			// guardamos en las posiciones iniciales el valor de aux que ya esta guardado
			array[i] = aux;
		}
		// comprobamos que se ha invertido el array
		System.out.println();
		for (int i = 0; i <= longitud; i++)
			System.out.print(array[i] + " ");
	}
}
