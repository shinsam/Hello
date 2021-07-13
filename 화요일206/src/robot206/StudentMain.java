package robot206;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student("이성계" , 20521, 19);
		Student s2 = new Student("이순신" , 20522, 18);
		Student s3 = new Student("정약용" , 20523, 19);
		
		s1.toPrint();
		s2.toPrint();
		s3.toPrint();
	}

}
