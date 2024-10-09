import java.util.Scanner;
class CheckPass{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your marks:");
	int x = s.nextInt();
	String str = (x >= 33 )? ("Congratulation! u are passed"): ("Sorry u are failed in th is examination try again!");
	System.out.println(str);
}
}