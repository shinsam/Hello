
public class Day05_클래스1 {

	public static void main(String[] args) {
		//객체 생성
		Car6 redCar = new Car6();
		redCar.color = "RED";
		redCar.name = "BMW";

		//파랑색 , G80을 생성하고 
		Car6 blueCar = new Car6();
		blueCar.color = "BLUE";
		blueCar.name = "G80";

		redCar.speedUp();
		redCar.speedUp();
		blueCar.speedDown();
		redCar.speedUp();
		redCar.speedDown();
		blueCar.speedDown();
		
		
		
	}
}
