
public class ShoppingMall_Main {

	public static void main(String[] args) {
		ShoppingMall tv = new ShoppingMall("AABB123");
		tv.addTotal(10);
		
		ShoppingMall camera = new ShoppingMall("CCDD987");
		camera.addTotal(20);
		camera.subTotal(5);
		
		HomeShopping bag = new HomeShopping("BAG8765");
		bag.setTime("12:30 PM");
		bag.addTotal(50);
		//BAG8765 ��۽ð��� 12:30 PM �Դϴ�.
		System.out.println(____________);
		
	}

}
