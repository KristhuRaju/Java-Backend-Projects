package BasicsProrames;

public class LoopYearOrNot {
public static void main(String[] args) {
	int year=2024;
	if(year%400==0) {
		System.out.println(year+ " : Loop year ");
	}else if (year%4==0 && year%100!=0) {
		System.out.println(year+" : Loop year");
	}else {
		System.out.println(year+" : Not a Loop year ");
	}
}
}
