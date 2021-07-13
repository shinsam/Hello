
public class Day07_스태틱변수연습 {

	public static void main(String[] args) {

		Student a = new Student();
		a.name = "홍길동";	a.age = 10;
		a.print(); 
		
		Student b = new Student();
		b.name = "박찬호"; 	b.age = 12;
		b.print();

		Student c = new Student("신경화" , 13);
		c.print();
		
		//a.school = "서울고 ";
		a.print();
		b.print();
		b.print(10);
		b.print("박찬호");

		//프라이빗 멤버 변수 접근
		c.setPhone("010-9999-9999"); 
		System.out.println();
		
		System.out.println(a.getAge());
		System.out.println(b.getAge());
		System.out.println(c.getAge());
		
	}
}
