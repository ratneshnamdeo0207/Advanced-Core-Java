import java.util.Scanner;
class CheckVowel{
	public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter any char:");
	char x = s.next().charAt(0);
	String str = (x == 'a' ||x == 'e' ||x == 'i' ||x == 'o' ||x == 'u' )? ("It is a vowel"): ("It is not a vowel");
	System.out.println(str);
}
}