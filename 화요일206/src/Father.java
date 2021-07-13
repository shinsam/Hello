
public class Father {
	String name;
	private int age;
	
	Father(String name ){
		this.name = name;
		System.out.println("부모 Father 생성자");
	}
	
	//age를 set / get 을 이용해서 접근하는 메소드 생성하기
	
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
