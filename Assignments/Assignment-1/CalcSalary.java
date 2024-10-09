import java.util.Scanner;
class CalcSalary{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter ur salary");
	float salary = sc.nextFloat();

	System.out.println("Enter ur no of yrs of experience");
	int yr = sc.nextInt();
	
	double bonus = (yr > 20)? (salary * 20)/100.0:(salary * 10)/100.0;

	
	System.out.println("Bonus = " + bonus);
	double newsalary = (bonus + salary);
	System.out.println("New Salary = " + newsalary);
}
}