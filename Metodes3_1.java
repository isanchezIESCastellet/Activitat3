package Metodes3_IkerSanchez;
import java.util.Iterator;
import java.util.Scanner;
/**
 * @author iker
 *
 */
public class Metodes3_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int number = getNumber(in);
		char letter = getChar(in);
		printTree(number, letter);
	}
	
	public static int getNumber(Scanner in) {
		int number = 0;
		boolean correctnum = false;
		do {
			System.out.print("Entra un número entre el 5 i el 29: ");
			
			if (in.hasNextInt()) {
				number = in.nextInt();
				if (number >= 5 && number<=29) {
					if (number%2==1) {
						correctnum = true;
					}else {
						System.out.println("Entrada invàlida");
					}
					
				}else {
					System.out.println("Entrada invàlida");
				}
					
			}else {
				System.out.println("Entrada invàlida");
				in.next();
			}
	
		} while (!correctnum);
		return number;
	}
	public static char getChar (Scanner in) {
		char letter = ' ';
		boolean isletter = false;
		do {
			System.out.print("Amb quina lletra vols que pinti l'arbre?: ");
			String word = in.next();
			int wordLength = word.length();
			if (wordLength==1) {
				letter = word.charAt(0);
				if (letter < 'A' || letter>'z') {
					System.out.println("El caràcter no és vàlid");
				}else {
					System.out.println();
					isletter = true;
				}
			}else {
				System.out.println("Input incorrecte.");
			}
		} while (!isletter);
		return letter;
	}
	public static void printTree (int number, char letter) {
		String space = " ";
		String log = "l";
		int counter = 0;
		int tmiddle = (number + 1) / 2;
		for (int i = 1; i <= number; i+=2) {
			for (int x = 0; x <= tmiddle; x++) {
				System.out.print(space);
			}
			tmiddle--;
			for (int j = 1; j <= i; j++) {
				System.out.print(letter);
			}System.out.println();
			counter++;
		}
		int loglength = counter / 3;
		int lspace = loglength-1;
		tmiddle = (number + 1) / 2;
		if(loglength != 1) {
			for (int y = 1; y < loglength; y++) {
				tmiddle--;
			}
			
		}
		for (int k = 0; k < loglength; k++) {
			for (int x = 0; x <= tmiddle; x++) {
				System.out.print(space);
			}
			for (int l = 0; l < loglength+lspace; l++) {
				System.out.print(log);
			}System.out.println();
		}
	}
} 
