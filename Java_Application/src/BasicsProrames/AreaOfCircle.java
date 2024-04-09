package BasicsProrames;

import java.util.Scanner;

public class AreaOfCircle {
public static void main(String[] args) {
	Scanner c= new Scanner(System.in);
	double radius = c.nextDouble();
	double area= Math.PI*radius*radius;
	System.out.println(area);
}
}
