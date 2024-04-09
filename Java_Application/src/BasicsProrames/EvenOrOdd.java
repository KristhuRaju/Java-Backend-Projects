package BasicsProrames;

import java.util.Scanner;

public class EvenOrOdd {
public static void main(String[] args) {
	System.out.println("Enter a Integer value to chek even or odd : ");
	Scanner s= new Scanner(System.in);
	int x= s.nextInt();
	if (x%2==0) {
		System.out.println("Given number is Even");
	}else {
		System.out.println("The Given number is Odd");
	}
}
}
