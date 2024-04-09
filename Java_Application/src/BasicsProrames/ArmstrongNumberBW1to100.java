package BasicsProrames;

public class ArmstrongNumberBW1to100 {
public static void main(String[] args) {
	int num,rem,sum=0,limit=1000;
	System.out.println("Armstrong number from 1 to N : ");
	for(int i=1;i<=limit;i++) {
		num = i;
		while(num>0) {
		rem=num%10;
		sum=sum+(rem*rem*rem);
		num=num/10;
		}if(sum == i) {
			System.out.println(i+" ");
		}
		sum=0;
	}
}
}
