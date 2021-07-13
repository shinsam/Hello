import java.util.Scanner;

public class Day01_입출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//출력
		
		
		System.out.println("이름:" + 123 + 456);
		System.out.print("홍");
		System.out.print("길동\n");
		System.out.printf("%d %f\n", 10 , 3.14);
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이:");
		int age = sc.nextInt();
		System.out.printf("당신의 나이는 %d 입니다." , age);
		System.out.println("이름:");
		String name = sc.next();
		System.out.printf("%s야 안녕" ,name );
				
	}
	//
}
