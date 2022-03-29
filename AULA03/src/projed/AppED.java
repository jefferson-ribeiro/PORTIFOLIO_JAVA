package projed;

import java.util.ArrayList;

public class AppED {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		lista.add(10);
		lista.add(20);
		lista.add(30);
		
		System.out.println("");
		
		for (int cont = 0; cont<lista.size(); cont++) {
			System.out.println(lista.get(cont));
			
			if (lista.get(cont)==20) {
				System.out.println("Achei");
				break; // para somente o if
				//return; para a aplicação
			}
		}

	}

}
