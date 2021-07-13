package robot206;

public class Student {
	String name;
	int hakbun;
	private int age;
	
	Student(){}
	
	Student(String name,int hakbun,int age){
		this.name = name;
		this.hakbun = hakbun;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHakbun() {
		return hakbun;
	}

	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	void toPrint() {
		System.out.println("이름:" + name + " 학번:" + hakbun + " 나이:" + age);
	}
	
}


