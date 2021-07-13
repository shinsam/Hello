
public class Truck extends Car6{
	
	int ton;
	
	public Truck(String color, String name, int velocity) {
		super(color,name, velocity);
		ton = 5;
	}

	//truck의 print :  이름과 톤 출력
	void print() {
		System.out.println("[Truck]" +name + ton);
		
	}
	
}
