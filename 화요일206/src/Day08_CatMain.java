
public class Day08_CatMain {

	public static void main(String[] args) {

		//1.�⺻ �����ڷ� ����� �����
		Cat cat1 = new Cat();
		cat1.name = "�ǻ�";
		cat1.age = 2;
		
		//2.�ǻ��� ������ ����غ���
		cat1.print();
		cat1.printCount();
		
		//3.�̸��� ���̸� �����ϸ鼭 ����̸� ������
		Cat cat2 = new Cat("������", 3);
		cat2.print();
		cat2.printCount();
		
		cat2.print("�ʷ���");
	}

}
