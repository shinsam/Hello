
public class Father {
	String name;
	private int age;
	
	Father(String name ){
		this.name = name;
		System.out.println("�θ� Father ������");
	}
	
	//age�� set / get �� �̿��ؼ� �����ϴ� �޼ҵ� �����ϱ�
	
	void setAge(int age) {
		this.age = age;
	}
	
	int getAge() {
		return this.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
