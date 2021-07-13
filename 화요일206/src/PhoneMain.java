
public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new Phone();
		p1.model = "NOTE9";
		p1.price = 10;
		p1.company = "삼성";
		System.out.println(p1.toPrint());
		
		//1. 객체를 생성할때 모델명과 가격을 받아서 생성하시오
		Phone p2 = new Phone("애플", "아이폰" , 100);
		System.out.println(p2.toPrint());
		
		p2.printTotal();
		
	}

}
