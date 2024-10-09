import java.util.Scanner;
class CheckVote{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter ur age:");
	int x = s.nextInt();
	String str = (x >= 18)? "U are eligible to vote" : "U are not elgible to vote";
	System.out.println(str);
}
}