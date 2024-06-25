package cl.praxis.utilidades;

public class UtilesGenerales {

	/**
	 * Método que permite obtener el numero Factorial segun el nuemro entregado
	 *
	 * @param int numeroFact, numero entregado del 1 al 10
	 * @return int del numero factorial
	 * @author: Autor Tomás Aguilera
	 * @version: 24/06/2024
	 */

	public int factorial(int numeroFact) {
		int numero = numeroFact;
		int factorial = 1;

		for (int i = 2; i <= numero; ++i) {
			factorial *= i;
		}
		return factorial;

	}
	
	
	/**
	 * Método que permite obtener como respuesta si el numero entregado es Paro o
	 * Impar
	 *
	 * @param int numeroParImpar, numero entregado del 1 al 10
	 * @return String con respuesta si es par o impar
	 * @author: Autor Tomás Aguilera
	 * @version: 24/06/2024
	 */

	public String parImpar(int numeroParImpar) {
		String respuestaParImpar;

		if (numeroParImpar % 2 == 0) {
			respuestaParImpar = " es numero Par";
		} else {
			respuestaParImpar = " es numero Impar";
		}
		return respuestaParImpar;

	}	
		
	
}