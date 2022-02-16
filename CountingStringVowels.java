package StringVowels;
import java.util.*;
public class CountingStringVowels {

	public static void main(String[] args) {
		String value;
		int i, count=0;
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter sentence to check vowel");
		value=sc.nextLine();
		for(i=0;i<value.length();i++)
		{
			ch=value.charAt(i);
			if((ch=='A'||ch=='a')||(ch=='E'||ch=='e')||(ch=='I'||ch=='i')||(ch=='O'||ch=='o')||(ch=='U'||ch=='u'))
			count ++;
		}
		
	System.out.println("no of vowels in a strings:"+count);
	}
}