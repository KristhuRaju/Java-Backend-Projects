package BasicsProrames;

public class DataTypesLength {
public static void main(String[] args) {
		    char[] chars = new char[]{'\u0429'};
		    String str = new String(chars);
		    byte[] bytes = str.getBytes();
		    System.out.println(bytes.length);
		  
}
}
