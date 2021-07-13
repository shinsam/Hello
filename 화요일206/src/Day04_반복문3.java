
public class Day04_반복문3 {

	public static void main(String[] args) {
		// 1 2 3 
		// 1 2 3
		// 1 2 3
		System.out.println("Quiz1==========");
		for(int i =1 ; i<=3; i++) {		//행처리
			for(int j = 1; j<=3;j++)
				System.out.print(j); 	//열
			System.out.println(); 		//한줄아래로
		}
		//1 1 1
		//2 2 2
		//3 3 3
		System.out.println("Quiz2==========");
		for(int i =1 ; i<=3; i++) {		//행처리
			for(int j=1; j<=3 ; j++)	//열
				System.out.print(i); 	
			System.out.println(); 		//한줄아래로
		}
		//1
		//1 2
		//1 2 3
		//1 2 3 4
		System.out.println("Quiz3==========");
		for(int i =1 ; i<=4; i++) {		//행처리
			for(int j=1; j<=i ; j++)	//열
				System.out.print(j); 	
			System.out.println(); 		//한줄아래로
		}
		
		//3 2 1
		//2 1
		//1
		System.out.println("Quiz4==========");
		for(int i =3 ; i>=1; i--) {		//행처리
			for(int j=i; j>=1 ; j--)	//열
				System.out.print(j); 	
			System.out.println(); 		//한줄아래로
		}
	}
}
