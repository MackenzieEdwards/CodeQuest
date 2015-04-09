import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("Prob04.in.txt"));
		while (file.hasNextLine()) {
			String s = file.nextLine();
			//System.out.println("Line is " + s);

			if (s.length() > 0) {
				String[] words = s.split(" ");
				for (int x = 0; x < words.length; x++) {
					//System.out.println(words[x]);
					String tmpStr = words[x];

					if (tmpStr.charAt(0) == 'a' || tmpStr.charAt(0) == 'e'
							|| tmpStr.charAt(0) == 'i'
							|| tmpStr.charAt(0) == 'o'
							|| tmpStr.charAt(0) == 'u')
					{
						System.out.print(words[x] + "yay");
					    System.out.print(" ");
					}
					else if (tmpStr.indexOf("qu") == 0)
					{
						System.out.print(tmpStr.substring(2)+"qu"+"ay");
						System.out.print(" ");
					}
					else if(tmpStr.indexOf("scr") == 0) 
					{
						System.out.print(tmpStr.substring(3)+"scr"+"ay");
						System.out.print(" ");
					}
					else {
						System.out.print(tmpStr.substring(1)+ tmpStr.charAt(0)+ "ay");
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}

		/*
		 * for(int i = 0; i < txtfile.length -1; i++;) {
		 * if(txtfile.charAt(0).equals("a") || txtfile.charAt(0).equals("e") ||
		 * txtfile.charAt(0).equals("i") || txtfile.charAt(0).equals("o") ||
		 * txtfile.charAt(0).equals("u")) { System.out.println(txtfile + "yay");
		 * } if() } String original = null; String translated; char firstLetter;
		 * 
		 * // translated = original;
		 * 
		 * 
		 * firstLetter = original.charAt(0);
		 * 
		 * translated = original.substring(1) + firstLetter + "ay";
		 */

	}
}
