package BasicsProrames;

public class o3TotalNumberOfOddNumber1to100 {
public static void main(String[] args) {
	int count=0;
	for(int r=0;r<=100;r++) {
		if(r%2 !=0) {
			count++;
		}
	}System.out.println(count);
}
}
