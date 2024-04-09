package BasicsProrames;

public class PalindromeOrNot {
public static void main(String[] args) {
	int num=121,rev=0,rem;
	while(num>0) {
		rem=num%10;
		rev=rev *10 +rem;
		num=num/10;
	}if(rev==num) {
		System.out.println("Given Number is Palindrom : "+rev);
	}else {
		System.out.println("Given Number is Not a Palindrom : "+rev);
	}
}
}
