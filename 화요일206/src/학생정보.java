
public class �л����� {
	//������ - ��������
	�л�����(){}
	�л�����( String name, String hakbun, int age  ){
		this.name = name ;
		this.hakbun = hakbun;
		this.age = age;
	}
	
	//�Ӽ�
	String name;
	String hakbun;
	protected int age;
	
	//�޼ҵ�
	void printStudent() {
		System.out.println("�̸�:"+ name + " �й�:" + hakbun);
	}
	
}
