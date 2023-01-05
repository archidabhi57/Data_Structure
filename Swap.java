import java.util.Scanner;
public class Swap
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		Swap(n1,n2);
	}
	public void Swap_demo(int n1,int n2)
	{
		n1 = n1+n2;
		n2 = n1-n2;
		n3 = n1-n2;

		System.out.println("after swap");
		System.out.println("1st no="+n1);
		System.out.println("2nd no="+n2);
		 
	}
}