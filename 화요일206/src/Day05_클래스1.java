
public class Day05_Ŭ����1 {

	public static void main(String[] args) {
		//��ü ����
		Car6 redCar = new Car6();
		redCar.color = "RED";
		redCar.name = "BMW";

		//�Ķ��� , G80�� �����ϰ� 
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
