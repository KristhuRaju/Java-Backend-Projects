package BasicsProrames;

import java.util.Scanner;

public class PalindromProgram {
public static void main(String[] args) {
	String original, reverse="";
	System.out.println("Enter a number to check palindrom : ");
	Scanner sc= new Scanner(System.in);
	original= sc.nextLine();
	int length= original.length();
	for(int i=length-1;i>=0;i--)
		reverse= reverse+original.charAt(i);
	if(original.equals(reverse))
	System.out.println("Palindrom ");
	else
		System.out.println("Not a Palindrom");
}
}
