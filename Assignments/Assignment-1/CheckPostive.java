import java.util.Scanner;
class CheckPostive{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter any no:");
	int x = s.nextInt();
	String str = (x <= 0)? (x + " is less than or equal to 0" ): (x + " is more than 0");
	System.out.println(str);
}
}