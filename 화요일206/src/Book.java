
public class Book {
	//å�� �̸�, ����, ���ڸ� ����ϴ� Ŭ����
	//������(Constructor)
	//Book(){} //�⺻�� , ��������
	
	//��� ���� (�ʵ�, �Ӽ�)
	String name;
	double price;
	String author; 
	
	//method
	void printBook() {
		System.out.println("����:" + name );
		System.out.println("����:" + price);
		System.out.println("����:" + author );
		System.out.println("====================");
	}
	
	void discountBook(  ) {  //������ 10% ����
		price = price * 0.9;
		System.out.println("���λ�ǰ 10.0%");
		printBook();
	}
	
	
	void discountBook( double per ) { //per :20%�̸� 20 �� �Է�
		price = price * per / 100;
		System.out.println("���λ�ǰ " + per + "%" );
		printBook();
	}
	
}








