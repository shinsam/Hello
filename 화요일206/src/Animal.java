//���� Ŭ���� -�θ�
public class Animal {
	
	String species; //��
	String name; 	//�̸�
	int age;		//����
	
	//�⺻�� ������
	Animal(){}
	
	Animal(String name){
		System.out.println("Animal :" + name );
	}
	
	Animal(String name, int age){
		System.out.println("Animal :" + name + "Age : " + age);
	}
	
	void toPrint() {
		System.out.println("�� ������ " + name);
	}
}



