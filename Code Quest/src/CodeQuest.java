import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CodeQuest {

	public static void main (String[] args) throws IOException
	   {
	      Scanner file = new Scanner( new File( "Prob01.in.txt" ));
	      int times = file.nextInt();
	      file.nextLine();
	      	     
	      for( int i = 0; i < times; i++ )
	      {
	    	int x = file.nextInt();
			if (x % 3 == 0 && x % 7 == 0) {
				System.out.println("CODEQUEST");
			} else if (x % 3 == 0) {
				System.out.println("CODE");
			} else if (x % 7 == 0) {
				System.out.println("QUEST");
			} else {
				System.out.println(x);
			}
		}
	}
}
