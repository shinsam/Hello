//������ �����ε�
//����ƽ ����, �޼ҵ�
//�޼ҵ� �����ε�

public class Cat {
	//������---�����ε�-----------------------------------
	Cat(){
		count++;				
	}  //�ٸ� �����ڰ� �����ٸ� �������� 
	
	Cat(String name, int age){
		this();	
		this.name = name;
		this.age = age;		
	}
	
	//��� ����------------------------------------
	String name;
	int age;
	static int count; //������ ������� �� ������
		
	//�޼ҵ� �����ε�--------------------------------------
	void print() {
		System.out.println(name + ":" + age +"��");
	}
	
	void print(String newName) {
		this.name = newName;
		print();		
	}
	
	String print(String newName, int a) {
		return "TTT";
	}
	
	static void printCount() {
		System.out.println("���� �� ������:" + count);
	}
	
}












