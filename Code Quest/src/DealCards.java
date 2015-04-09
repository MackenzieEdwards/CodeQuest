import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DealCards {

	public static void main(String[] args) throws FileNotFoundException {
		char c = 'z';
		int hands = 0;
		int cards = 1;
		int redCards = 0;
		int blackCards = 0;
		int threes = 0, fours = 0, fives = 0, sixes = 0, sevens = 0, eights = 0, tens = 0, jacks = 0, queens = 0, kings = 0, aces = 0;
		int twos = 0;
		int nines = 0;
		int clubs = 0, spades = 0, diamonds = 0, hearts = 0;

		Scanner file = new Scanner(new File("Prob02.in.txt"));

		while (file.hasNextLine()) {
			String s = file.nextLine();
			hands++;
			System.out.println("HAND " + hands);

			for (int x = 0; x < s.length(); x++) {
				c = s.charAt(x);

				if (c == ' ')
					cards++;
				if (c == '2')
					twos++;
				if (c == '3')
					threes++;
				if (c == '4')
					fours++;
				if (c == '5')
					fives++;
				if (c == '6')
					sixes++;
				if (c == '7')
					sevens++;
				if (c == '8')
					eights++;
				if (c == '9')
					nines++;
				if (c == '1')
					tens++;
				if (c == 'J')
					jacks++;
				if (c == 'Q')
					queens++;
				if (c == 'K')
					kings++;
				if (c == 'A')
					aces++;
				if (c == 'C')
					clubs++;
				if (c == 'S')
					spades++;
				if (c == 'D')
					diamonds++;
				if (c == 'H')
					hearts++;
				if (c == 'C' || c == 'S')
					blackCards++;
				if (c == 'D' || c == 'H')
					redCards++;
			}
			System.out.println(redCards + "-Red");
			System.out.println(blackCards + "-Black");
			System.out.println(clubs + "-Clubs");
			System.out.println(diamonds + "-Diamonds");
			System.out.println(hearts + "-Hearts");
			System.out.println(spades + "-Spades");
			System.out.println(twos + "-2 cards");
			System.out.println(threes + "-3 cards");
			System.out.println(fours + "-4 cards");
			System.out.println(fives + "-5 cards");
			System.out.println(sixes + "-6 cards");
			System.out.println(sevens + "-7 cards");
			System.out.println(eights + "-8 cards");
			System.out.println(nines + "-9 cards");
			System.out.println(tens + "-10 cards");
			System.out.println(jacks + "-Jack");
			System.out.println(queens + "-Queens");
			System.out.println(kings + "-Kings");
			System.out.println(aces + "-Aces");
			
			cards = 1;
			twos = 0;
			threes = 0;
			fours = 0;
			fives = 0;
			sixes = 0;
			sevens = 0;
			eights = 0;
			nines = 0;
			tens = 0;
			jacks = 0;
			queens = 0;
			kings = 0;
			aces = 0;
			clubs = 0;
			spades = 0;
			hearts = 0;
			diamonds = 0;
			redCards = 0;
			blackCards = 0;

			System.out.println();
		}

	}

}
