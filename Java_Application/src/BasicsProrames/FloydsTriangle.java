package BasicsProrames;

import java.util.Scanner;

public class FloydsTriangle {
public static void main(String[] args) {
	int count=1;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Number Of Rows ");
	int Rows = sc.nextInt();
	System.out.println("Floyd Triangle Genrated");
	for(int i=1;i<=Rows;i++) {
		for(int j=1;j<i;j++) {
			System.out.print(count+" ");
			count++;
		}
		System.out.println("");
	}
}
}
