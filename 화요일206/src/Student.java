
public class Student {
	
	//������
	Student(){
		count++;
		printCount();
	}
	
	Student(String name , int age  ){
		this();
		this.name = name ;
		this.age = age;
	}
	//�������
	static final  String school = "�κ��� ";
	String name;
	int age;
	private String phone ; 
	static int count=0; //�л��� 
		
	//�޼ҵ�
	void print() {  //�����ε�
		System.out.println(school + name + ":" + age);
		this.printCount();
	}
	
	void print(int age) {//�����ε�
		System.out.println("����:" + age);
	}
	
	void print(String name) {//�����ε�
		System.out.println("�̸�:" + name);
	}
	
	void printCount() {
		System.out.println("���� ��ϵ� �л��� " + count + "���Դϴ�.");
	}
	
	//�����̺� ��� ���� ���� ���� �޼ҵ�
	//	get : �о����        
	//	set : ���� , �����ϱ�  
	
	void setPhone( String phone ) {
		this.phone = phone;
	}
	
	String getPhone() {
		return this.phone;
	}
	
	//���̸� �о���� �޼ҵ� get �� �߰��غ���
	int getAge() {
		return this.age;
	}
}








