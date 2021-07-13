import java.util.Scanner;

public class Day03_제어문2 {

	public static void main(String[] args) {
		//입력
		//출생년도(int year) : 2004
		//성별(String MF) : 남 - M , 여자 -F
		//---------------
		//나이계산 : age = 2021 - 2004 + 1
		//입력받은 성별을 if문으로 처리하여 
		//최종 출력 :당신은 18세 남자(여자)
		
		int year;
		String MF;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출생년도:");
		year = sc.nextInt();
		int age = 2021 - year + 1 ; 

		System.out.print("성별:");
		MF = sc.next();
		if(MF.equals("M") || MF.equals("m")  )
			System.out.println("당신은 "+ age + "세 남자입니다." );
		else if( MF.equals("F") )
			System.out.println("당신은 "+ age + "세 여자입니다." );
		else
			System.out.println("잘못 입력하셨습니다.");
		
	}

}
