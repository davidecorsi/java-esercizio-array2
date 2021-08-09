/*
 Scrivete un applicazione che dato in ingresso una sequenza di numeri interi produca in output
 la sequenza stessa in ordine crescente. Anche la lunghezza della sequenza deve essere stabilita dall'utente
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserire la lunghezza della sequenza ");
		int l = input.nextInt();
		
		// inizializzazione array
		int[] nArray = new int[l];
		
		// lettura numeri
		for(int i = 0; i < nArray.length; i++) {
			System.out.print("Inserisci un numero ");
			nArray[i] = input.nextInt();
		}
				
		// ordinamento array
		for(int i = 0; i < nArray.length -1; i++) {
			for(int j = i + 1; j < nArray.length; j++) {
				if(nArray[j] < nArray[i]) {
					int n = nArray[j];
					nArray[j] = nArray[i];
					nArray[i] = n;
				}
			}
		}
		
		// stampa del risultato
		for(int n: nArray) {
			System.out.println(n);
		}
	}
}
