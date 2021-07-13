
public class 학생정보 {
	//생성자 - 생략가능
	학생정보(){}
	학생정보( String name, String hakbun, int age  ){
		this.name = name ;
		this.hakbun = hakbun;
		this.age = age;
	}
	
	//속성
	String name;
	String hakbun;
	protected int age;
	
	//메소드
	void printStudent() {
		System.out.println("이름:"+ name + " 학번:" + hakbun);
	}
	
}
