package BasicsProrames;

import java.util.Scanner;

public class CheckEvenOrOdd {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter A Number :");
	int num = sc.nextInt();
	if(num%2==0) {
		System.out.println("Entered Number EVEN");
	}else {
		System.out.println("Enterd Number ODD");
	}
}
}
