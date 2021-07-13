
public class HomeShopping extends ShoppingMall{
	
	private String time; //12½Ã30ºÐ
	
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
