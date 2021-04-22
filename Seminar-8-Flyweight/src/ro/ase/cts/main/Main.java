package ro.ase.cts.main;

import java.util.Scanner;

import ro.ase.cts.flyweight.CharacterFactory;
import ro.ase.cts.flyweight.CustomCharacter;
import ro.ase.cts.flyweight.CustomFontCharacter;
import ro.ase.cts.flyweight.TemporaryState;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int x=0;
		int y=0;
		char c=0;
		int i=0;
		while(c != '^') {
			c = (char)scanner.next().charAt(0);
			x++;
			y++;
			CustomCharacter customChar =	CharacterFactory.getCharacter(c);
			customChar.displayCharacter(new TemporaryState(x,y));
			i++;
			if(i>2) {
				((CustomFontCharacter)customChar).setFontName("Times new Roman");
			}
		}
		
		scanner.close();
	}

}
