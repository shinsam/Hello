
public class DogMain {

	public static void main(String[] args) {

		Dog a = new Dog("Ǫ��", 3, "���ڻ�");
		Dog b = new Dog("�ҵ�", 5 , "������");
		
		//Ǫ���� ¢��
		a.barking();
		//Ǫ�� �����
		a.hungry();
		//�ҵ� ����
		b.sleeping();
		//�ҵ� �����
		b.hungry();
		
		String str = b.toPrint();
		System.out.println(str);
		System.out.println(a.toPrint());
		
	}

}
