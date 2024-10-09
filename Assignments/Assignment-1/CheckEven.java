import java.util.Scanner;
class CheckEven{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter any No:");
	int x = s.nextInt();
	String str = (x % 2 == 0 )? ("It is a even"): ("It is not even that means it is an odd no");
	System.out.println(str);
}
}