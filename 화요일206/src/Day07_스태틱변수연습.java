
public class Day07_����ƽ�������� {

	public static void main(String[] args) {

		Student a = new Student();
		a.name = "ȫ�浿";	a.age = 10;
		a.print(); 
		
		Student b = new Student();
		b.name = "����ȣ"; 	b.age = 12;
		b.print();

		Student c = new Student("�Ű�ȭ" , 13);
		c.print();
		
		//a.school = "����� ";
		a.print();
		b.print();
		b.print(10);
		b.print("����ȣ");

		//�����̺� ��� ���� ����
		c.setPhone("010-9999-9999"); 
		System.out.println();
		
		System.out.println(a.getAge());
		System.out.println(b.getAge());
		System.out.println(c.getAge());
		
	}
}
