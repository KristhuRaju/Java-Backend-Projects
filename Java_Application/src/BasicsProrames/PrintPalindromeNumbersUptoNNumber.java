package BasicsProrames;

public class PrintPalindromeNumbersUptoNNumber {
public static void main(String[] args) {
	int num,r,rev=0;
	int limit=50;
	
	for(int i=1;i<=limit;i++) {
		num=i;
		while(num>0) {
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(rev== i) {
			System.out.println(i+" ");
		}
		rev=0;
	}
}
}
