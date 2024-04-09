package BasicsProrames;

public class SumOfTheDigitsOfaNumber {
public static void main(String[] args) {
	int num=1003, rem=0,sum=0,temp;
	temp=num;
	while(num>0) {
		rem=num%10;
		sum=sum+rem;
		num=num/10;
		
	}System.out.println(temp+"+=====+"+sum);
}
}
