//자식
public class CircleExam extends Circle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.r = 5;
		System.out.println("원의 넓이" + c1.calArea());
		System.out.println("원의 둘레" + c1.calRound());
	}
}
