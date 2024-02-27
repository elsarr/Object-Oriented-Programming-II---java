package Project1;

public class PrintCodeword 
{
	private char letter;
	private int ascii;
	private int number;
	public PrintCodeword(char initial, int num)
	{
		if (!Character.isUpperCase(initial))
		{
			System.out.println("Character must be uppercase.");
			System.exit(0);
		}
		else
		{
			letter = initial;
			ascii = (int) letter;
		}
		
		if (num < 0 || num > 9)
		{
			System.out.println("Number must be between 0 and 9.");
			System.exit(0);
		}
		else
		{
			number = num;
		}
		
	}
	
	public void print_Code()
	{
		for (int count = 0, i = ascii, j = number; i <= 90 && i >= 65 && j >=0 && j <= 9 && count <26; i++, j++, count++)
		{
			System.out.println((char)i + "" + j);
			
			if (j == 9)
			{
				j = -1;
				continue;
			}
			
			if (i == 90)
			{
				i = 64;
				continue;
			}
		}
	}
	
	
}
