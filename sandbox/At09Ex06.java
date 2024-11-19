package sandbox;

import java.util.Scanner;

public class At09Ex06 {
	public static void main(String[] args) {
		Scanner cl = new Scanner(System.in);
		String unMot;
		boolean pal;
		
		System.out.print("Inscrivez un mot ou un nombre entier : ");
		unMot = cl.next();
		pal = estPalindrome(unMot);
		if (pal) {
			System.out.println(unMot + " est un palindrome.");
		} else {
			System.out.println(unMot + " n'est pas un palindrome.");
		}		
	}
	
	public static boolean estPalindrome(String mot) {
		int pos, longMot;
		boolean palindrome;
		String motMin;
		
		motMin = mot.toLowerCase();
		pos = 0;
		longMot = mot.length();
		palindrome = true;
		while (pos < longMot/2) {
			if (motMin.charAt(pos) != motMin.charAt(longMot-pos-1)) {
				return false;
			}
			++pos;
		}
		return true;
	}
}