
public class Child extends Father {
	
	Child(String name){
		super(name);
		System.out.println("�ڽ� child ������");
	}
	//�ڽ� Ŭ�������� �޼ҵ� �߰�
	
	void gotoSchool() {
		System.out.println(name + "�б����ϴ�.");
	}

	public static void main(String[] args) {
		Child me = new Child("ȫ�浿");
		me.setAge(10);
		
		System.out.println(me.name + me.getAge()+"��");
		me.gotoSchool();
	}

}
