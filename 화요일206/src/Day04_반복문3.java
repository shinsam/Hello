
public class Day04_�ݺ���3 {

	public static void main(String[] args) {
		// 1 2 3 
		// 1 2 3
		// 1 2 3
		System.out.println("Quiz1==========");
		for(int i =1 ; i<=3; i++) {		//��ó��
			for(int j = 1; j<=3;j++)
				System.out.print(j); 	//��
			System.out.println(); 		//���پƷ���
		}
		//1 1 1
		//2 2 2
		//3 3 3
		System.out.println("Quiz2==========");
		for(int i =1 ; i<=3; i++) {		//��ó��
			for(int j=1; j<=3 ; j++)	//��
				System.out.print(i); 	
			System.out.println(); 		//���پƷ���
		}
		//1
		//1 2
		//1 2 3
		//1 2 3 4
		System.out.println("Quiz3==========");
		for(int i =1 ; i<=4; i++) {		//��ó��
			for(int j=1; j<=i ; j++)	//��
				System.out.print(j); 	
			System.out.println(); 		//���پƷ���
		}
		
		//3 2 1
		//2 1
		//1
		System.out.println("Quiz4==========");
		for(int i =3 ; i>=1; i--) {		//��ó��
			for(int j=i; j>=1 ; j--)	//��
				System.out.print(j); 	
			System.out.println(); 		//���پƷ���
		}
	}
}
