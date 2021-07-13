
public class Phone {
//생성자
	Phone(){
		total++;
	}
	Phone(String company, String model, int price ){
		this();
		this.company = company;
		this.model = model;
		this.price = price;
	}
	
//멤버변수
	String model;
	int price;
	static int total;
	String company;
	
		
//멤버 메소드
	String toPrint() {//출력할 스타일로 만들어서 반환
		//String str = this.price +"만원짜리 "+ this.model + "스마트폰" ;
		String str  = this.company + " " + this.model + " " + this.price + "만원";
		return str;
	}
	void printTotal() {
		System.out.println("현재 총 " + total +"개 재고있음.");	
	}
}

////4. 제조사(company) 의 정보도 출력할수 있도록 프로그램을 수정하세요
////출력예제) 
//100만원짜리 아이폰스마트폰== >
//애플 아이폰 100만원 





























