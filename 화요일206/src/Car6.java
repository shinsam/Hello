public class Car6 { //부모
	//속성
	String color;
	String name;
	int velocity;
	
	//생성자 
	Car6(){}
	Car6(String color, String name, int velocity){
		this.color = color;
		this.name = name;
		this.velocity = velocity;
	}
	
	//메소드
	void speedUp() {
		System.out.println(name + "속도 올립니다.");
	}
	
	void speedDown() {
		System.out.println(name + "속도 내리기");
	}
	
	void print() {
		System.out.println("[CAR]");
	}
	
}