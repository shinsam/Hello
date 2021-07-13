
public class Book {
	//책의 이름, 가격, 저자를 출력하는 클래스
	//생성자(Constructor)
	//Book(){} //기본형 , 생략가능
	
	//멤버 변수 (필드, 속성)
	String name;
	double price;
	String author; 
	
	//method
	void printBook() {
		System.out.println("제목:" + name );
		System.out.println("가격:" + price);
		System.out.println("저자:" + author );
		System.out.println("====================");
	}
	
	void discountBook(  ) {  //무조건 10% 할인
		price = price * 0.9;
		System.out.println("할인상품 10.0%");
		printBook();
	}
	
	
	void discountBook( double per ) { //per :20%이면 20 을 입력
		price = price * per / 100;
		System.out.println("할인상품 " + per + "%" );
		printBook();
	}
	
}








