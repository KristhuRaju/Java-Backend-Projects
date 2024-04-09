package BasicsProrames;

public class FibnaciiSeriesprograms {
public static void main(String[] args) {
	int count=10,n1=0,n2=1;
	System.out.println("Count of febinacci series : "+count);
	for(int i=1;i<=count;++i) {
		System.out.println(n1+" ");
		int s= n1+n2;
		n1= n2;
		n2=s;
		
	}
	
}
}
