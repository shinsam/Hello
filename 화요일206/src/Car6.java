public class Car6 { //�θ�
	//�Ӽ�
	String color;
	String name;
	int velocity;
	
	//������ 
	Car6(){}
	Car6(String color, String name, int velocity){
		this.color = color;
		this.name = name;
		this.velocity = velocity;
	}
	
	//�޼ҵ�
	void speedUp() {
		System.out.println(name + "�ӵ� �ø��ϴ�.");
	}
	
	void speedDown() {
		System.out.println(name + "�ӵ� ������");
	}
	
	void print() {
		System.out.println("[CAR]");
	}
	
}