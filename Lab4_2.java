import java.util.Scanner;
public class Lab4_2 //DetermineInput
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char a[] = new char[100];
		System.out.println("Enter string :");
		String str = sc.next();
		char temp;
		int counta = 0 ;
		int countb = 0;

		for(int i=0;i<str.length();i++)
		{
			temp = str.charAt(i);
			a[i]=temp;

			if(temp =='a')
			{
				counta ++;
			}
			else if(temp=='b')
			{
				countb++;
			}
		}
		System.out.println("counta:" + counta);
		System.out.println("countb:" + countb);

		if(counta == countb)
		{
			System.out.println("Your string is valid");
		}
		else
		{
			System.out.println("Your string is not valid");
		}
	}
}