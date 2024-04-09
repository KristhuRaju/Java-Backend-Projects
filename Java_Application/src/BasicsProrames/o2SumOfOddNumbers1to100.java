package BasicsProrames;

public class o2SumOfOddNumbers1to100 {
public static void main(String[] args) {
	int sum=0;
	for(int k=0;k<=100;k++) {
		if(k%2 != 0) {
			sum=sum+k;
		}
	}System.out.println(sum);
}
}
