
public class Taxi extends Car6 {//�ڽ�

	int pay = 3000;
	
	void payUp() {
		pay += 100; 
		System.out.println("������:" + pay);
	}
	
	
	void print() {
		//Taxi�� print:  �̸��� ���� ���
		System.out.println("[Taxi]" + name + color);
	}
}
