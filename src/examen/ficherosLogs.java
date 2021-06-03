package examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class ficherosLogs {

	private final static Logger LOGGER = Logger.getLogger("Nodo"); 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lista = new ArrayList();
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		do {
			System.out.println("Introduzca un valor: (0 para salir)");
			valor = teclado.nextInt();
			nodo nodo = new nodo(valor);
			if(valor!=0) {
				lista.add(nodo);
			}
		}while(valor!=0);
	}

}
