//생성자 오버로딩
//스태틱 변수, 메소드
//메소드 오버로딩

public class Cat {
	//생성자---오버로딩-----------------------------------
	Cat(){
		count++;				
	}  //다른 생성자가 없었다면 생략가능 
	
	Cat(String name, int age){
		this();	
		this.name = name;
		this.age = age;		
	}
	
	//멤버 변수------------------------------------
	String name;
	int age;
	static int count; //생성한 고양이의 총 마리수
		
	//메소드 오버로딩--------------------------------------
	void print() {
		System.out.println(name + ":" + age +"살");
	}
	
	void print(String newName) {
		this.name = newName;
		print();		
	}
	
	String print(String newName, int a) {
		return "TTT";
	}
	
	static void printCount() {
		System.out.println("현재 총 마리수:" + count);
	}
	
}












