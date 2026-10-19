import java.util.Scanner;

public class input_user
	{
	public static void main(String[] args)
		{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a integer:");
		int num = input.nextInt();
		System.out.println("num = "+num);
		System.out.println("Enter Your Name:");
		String name=input.next();
		System.out.println("Thanks "+name);
		}
	}
