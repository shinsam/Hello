
public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new Phone();
		p1.model = "NOTE9";
		p1.price = 10;
		p1.company = "�Ｚ";
		System.out.println(p1.toPrint());
		
		//1. ��ü�� �����Ҷ� �𵨸�� ������ �޾Ƽ� �����Ͻÿ�
		Phone p2 = new Phone("����", "������" , 100);
		System.out.println(p2.toPrint());
		
		p2.printTotal();
		
	}

}
