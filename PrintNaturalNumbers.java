package BasicProgram;

import java.util.Scanner;

public class PrintNaturalNumbers {
	public static void main(String[]args) {
		int i,n;
		
		System.out.println("Natural prime Number;");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			System.out.println();
		}
	}
}