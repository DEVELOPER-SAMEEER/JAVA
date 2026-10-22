import java.util.Scanner;
public class arrayAvarage
    {
    public static void main(String[] args)
	{
	int total=0;
	float avarage;
	int ages[]={23,22,18,20,17,21,25};
	for(int i=0;i<7;i++)
	    {
	    total+=ages[i];
	    }
	avarage=(float)total/7;
	System.out.println("Avarage = "+ avarage);
	}
    }
