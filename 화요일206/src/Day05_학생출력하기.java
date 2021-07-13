
public class Day05_학생출력하기 {

	public static void main(String[] args) {

		학생정보 s1 = new 학생정보();
		s1.name = "김가영";
		s1.hakbun = "20600";
		s1.age = 18;

		s1.printStudent();
		s1.age = 19;
		s1.printStudent();
		학생정보 s2 = new 학생정보("홍길동", "30900", 20);
		s2.printStudent();
		
		

	}

}
