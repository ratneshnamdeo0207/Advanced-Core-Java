import java.util.Scanner;
class CheckLeap{

	public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter any year:");
	int yr = sc.nextInt();
	
	boolean b = (yr % 4 == 0) && (yr % 100!= 0) || (yr % 400 == 0)? true : false;
	//System.out.println(b);
	if(b)
{
	System.out.println("It is a leap year");

}
else{
	System.out.println("It is not a leap Year");
}
}
}