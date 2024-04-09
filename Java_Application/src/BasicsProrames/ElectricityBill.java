package BasicsProrames;

public class ElectricityBill {
public static void main(String[] args) {
	int units=244,bill=0;
	if(units>=100) {
		
		if(units>=200) {
			
			if(units>=300) {
				bill=units*8;
			}else {
				bill=units*6;
			}
		}bill=units*4;
	}System.out.println("Raju House Electricity Bill ");
	System.out.println("Units : "+units);
	System.out.println("Power Bill : "+bill);
}
}
