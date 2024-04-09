package BasicsProrames;

public class ArmstrongNumber {
public static void main(String[] args) {
	int num=234,r,t,sum=0;
	t=num;
	for(int i=0;i<num;i++) {
		while(num>0) {
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
	}
	if(t== sum) {
		System.out.println("Given Number is armStrong number : "+t);
	}else {
		System.out.println("Given Number is not armStrong number :"+t);
	}
}
}
