import java.util.Scanner;

public class Day04_�ݺ���2 {

	public static void main(String[] args) {
		//��� N�� �Է¹޾�
		//1���� N������ ���� ���ϴµ�
		//Ȧ�� : +
		//¦�� : -
		//���) +1-2+3-4+5-6 = -3
		
		int N;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N:");
		N = sc.nextInt();
		for(int i = 1; i<=N; i++ ) {
			if(i%2==1){//Ȧ
				System.out.print("+" + i );
				//sum+=i;  //sum = sum + i
			}else {//¦
				System.out.print("-" + i);
				//sum-=i;
			}
		}
		System.out.println("=" + sum );
	}
}







