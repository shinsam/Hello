
public class Student {
	
	//생성자
	Student(){
		count++;
		printCount();
	}
	
	Student(String name , int age  ){
		this();
		this.name = name ;
		this.age = age;
	}
	//멤버변수
	static final  String school = "로봇고 ";
	String name;
	int age;
	private String phone ; 
	static int count=0; //학생수 
		
	//메소드
	void print() {  //오버로딩
		System.out.println(school + name + ":" + age);
		this.printCount();
	}
	
	void print(int age) {//오버로딩
		System.out.println("나이:" + age);
	}
	
	void print(String name) {//오버로딩
		System.out.println("이름:" + name);
	}
	
	void printCount() {
		System.out.println("현재 등록된 학생은 " + count + "명입니다.");
	}
	
	//프라이빗 멤버 변수 접근 위한 메소드
	//	get : 읽어오기        
	//	set : 지정 , 저장하기  
	
	void setPhone( String phone ) {
		this.phone = phone;
	}
	
	String getPhone() {
		return this.phone;
	}
	
	//나이를 읽어오는 메소드 get 을 추가해보자
	int getAge() {
		return this.age;
	}
}








