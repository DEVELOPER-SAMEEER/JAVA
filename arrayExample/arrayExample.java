import java.util.Scanner;
public class arrayExample
	{
	public static void main(String[] args)
		{
		Scanner input=new Scanner(System.in);
		int marks[]=new int[5];
		System.out.println("Enter 5 integer elements:");
		for(int i=0;i<5;i++)
			{
			marks[i]=input.nextInt();
			}
		System.out.println("Entered elements are:");
		for(int i:marks)
			{
			System.out.printf("%d,",i);
			}
		System.out.println();
		int max=marks[0],min=marks[0];
		for(int i:marks)
			{
			if(i<=min)
				{
				min=i;
				}
			if(i>=max)
				{
				max=i;
				}
			}
		System.out.println("max = "+ max +" & min = "+ min);
		}
	}
