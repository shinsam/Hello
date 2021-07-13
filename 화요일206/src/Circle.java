//부모
public class Circle {
	//생성자
	Circle(){} //기본형
	Circle(double r ){
		this.r = r;
	}
	
	//멤버변수
	double r;
	
	//원의 넓이 : r*r*3.14
	double calArea() {
		return r*r*3.14;
	}
	
	//원의 둘레 : 2*r*3.14
	double calRound() {
		return 2*r*3.14;
	}
	
}
