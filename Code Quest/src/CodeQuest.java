public class CodeQuest
	{

	public static void main(String[] args)

		{ 
		for (int i = 1; i <= 100; i++)
			{
			if (i % 3 == 0 && i % 7 == 0)
				{
				System.out.println("CODEQUEST" );
				} 
			else if (i % 3 == 0)
				{
				System.out.println("CODE");
				}
			else if (i % 7 == 0)
				{
				System.out.println("QUEST");
				}
			else
				{
				System.out.println(i);
				}
			}
		}
	}
