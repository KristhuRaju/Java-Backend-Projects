package BasicsProrames;

import java.util.Scanner;

public class FindSimpleInterst {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int principle = sc.nextInt();
	double time = sc.nextDouble();
	int rate=sc.nextInt();
	int si=(int)(principle*rate*time)/100;
	System.out.println(si);
}
}
