import java.util.Scanner;
class CheckLower
{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter any Char(Only Char!!):");
	char c = s.next().charAt(0);
	
	String str = (((int)c >= 97) && ((int)c <= 122)) ? "It is lower case " : "It is not lower case ";
	System.out.println(str);

}

}