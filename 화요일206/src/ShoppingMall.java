
public class ShoppingMall {
	String code;
	static int total = 0;
	
	ShoppingMall(){}
	
	ShoppingMall(String code){
		this.code = code;
	}
	
	void addTotal(int count) {
		total += count ; 
		System.out.println("���� �� ���:" + total);
	}
	
	void subTotal(int count) {
		total -= count ; 
		System.out.println("���� �� ���:" + total);
	}
}
