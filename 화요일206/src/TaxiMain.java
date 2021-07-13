
public class TaxiMain {

	public static void main(String[] args) {
		Taxi t1 = new Taxi();
		t1.name  = "카카오택시";
		t1.color = "RED ";
		t1.velocity = 50;
		
		t1.speedUp();
		t1.payUp();
		t1.payUp();
		
		Truck t2 = new Truck("파랑" , "포터" , 100);
		t2.print();
		
		t1.print();
		
		
		
	}

}
