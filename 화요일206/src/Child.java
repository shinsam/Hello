
public class Child extends Father {
	
	Child(String name){
		super(name);
		System.out.println("자식 child 생성자");
	}
	//자식 클래스만의 메소드 추가
	
	void gotoSchool() {
		System.out.println(name + "학교갑니다.");
	}

	public static void main(String[] args) {
		Child me = new Child("홍길동");
		me.setAge(10);
		
		System.out.println(me.name + me.getAge()+"세");
		me.gotoSchool();
	}

}
