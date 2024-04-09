package Stringsprograms;

public class SctringCreationTypres {
public static void main(String[] args) {
	String s1="RajuB";
	String s2= "RajuB";
	String s3=new String("RajuB"); 
	
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s1.equals(s3));
	System.out.println(s2.equals(s3));
}
}
