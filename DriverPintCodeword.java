package Project1;

/*
 	The program outputs a certain coded language. The program prints
	26 code words, each comprising one letter and one digit, for example, A0, B1, C2,
	D3, and so on. it should output 26 output statements.
	
	If the value of letter reaches Z, it will then automatically move to A. Similarly, if the
	value of digit reaches 9, then it should also move automatically to 0
 */

public class DriverPintCodeword 
{

	public static void main(String[] args) 
	{
		PrintCodeword test = new PrintCodeword('D', 5);
		test.print_Code();
	}

}
