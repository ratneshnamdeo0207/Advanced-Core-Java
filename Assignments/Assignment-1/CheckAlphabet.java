import java.util.Scanner;
class CheckAlphabet{
	public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any key");
	int c = sc.next().charAt(0);
	
	String a = ((c >= 65) && (c <= 90) || (c >= 97) && (c <= 122)) ?  (((c >= 65) && (c <= 90))? ("It is a capital letter, therefore, its lower letter is  " + (char)(c + 32) + (((char)c == 'A' ||(char)c == 'E' ||(char)c == 'I' ||(char)c == 'O' ||(char)c == 'U') ? " & It is a vowel": " & It is not a vowel" )) : ("It is a small letter" +  (((char)c == 'a' ||(char)c == 'e' ||(char)c == 'i' ||(char)c == 'o' ||(char)c == 'u' ) ? " & It is a vowel": " & It is not a vowel" ))):"Enter a valid char";
	 
	System.out.println(a);
}

}
