import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PigLatin
	{
	public static void main(String[] args) throws FileNotFoundException
		{
		Scanner file = new Scanner(new File("Prob04.in.txt"));
		int lines = file.nextInt();
		file.nextLine();
		for(int j = 0; j < lines; j++)
			{
			String s = file.nextLine();
			String[] words = s.split(" ");
			for (int x = 0; x < words.length; x++)
				{
				String tmpStr = words[x];
				int counter = 0;

				for (int i = 0; i < words.length -3; i++)
					{
					if (tmpStr.charAt(0) == 'a' || tmpStr.charAt(0) == 'e'
							|| tmpStr.charAt(0) == 'i'
							|| tmpStr.charAt(0) == 'o'
							|| tmpStr.charAt(0) == 'u')

						{
						break;
						}

					else
						{
						counter++;
						}
					}
				if (counter <= 1)
					{
					if (tmpStr.charAt(0) == 'a' || tmpStr.charAt(0) == 'e'
							|| tmpStr.charAt(0) == 'i'
							|| tmpStr.charAt(0) == 'o'
							|| tmpStr.charAt(0) == 'u')
						{
						System.out.print(tmpStr + "yay ");
						} else
						{
						System.out.print(tmpStr.substring(1,
								tmpStr.length())
								+ tmpStr.substring(0, 1) + "ay ");
						}
					}

				else
					{
					System.out.print(tmpStr.substring(counter,
							tmpStr.length())
							+ tmpStr.substring(0, counter) + "ay ");
					}
				}
			System.out.println();
			}
		}
	}
