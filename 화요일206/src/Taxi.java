
public class Taxi extends Car6 {//자식

	int pay = 3000;
	
	void payUp() {
		pay += 100; 
		System.out.println("현재요금:" + pay);
	}
	
	
	void print() {
		//Taxi의 print:  이름과 색상 출력
		System.out.println("[Taxi]" + name + color);
	}
}
