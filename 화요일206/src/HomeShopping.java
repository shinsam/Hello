
public class HomeShopping extends ShoppingMall{
	
	private String time; //12��30��
	
	HomeShopping(String code) {
		super(code);
	}

	void setTime(String time) {
		this.time = time;
	}
	
	String getTime() {
		return this.time;
	}
	
}
