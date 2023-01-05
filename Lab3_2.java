import java.util.Scanner;
class Employee
{
	int Employee_id;
	String Name;
	String Designation;
	double Salary;

	Scanner sc = new Scanner(System.in);

	public void print()
	{
		System.out.println("Enter Employee_id=");
		Employee_id = sc.nextInt();

		System.out.println("Enter Name=");
		Name = sc.next();

		System.out.println("Enter Designation=");
		Designation = sc.next();

		System.out.println("Enter Salary=");
		Salary = sc.nextDouble();

	}

	public void display()
	{
		System.out.println("Employee_id="+Employee_id);
		System.out.println("Name="+Name);
		System.out.println("Designation="+Designation);
		System.out.println("Salary="+Salary);
	}
}
public class Employee_details
{
	public static void main(String[] args)
	{
		Employee_details ei = new Employee_details();

		ei.print();
		ei.display();
	}
}