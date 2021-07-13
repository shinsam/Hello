import java.util.Scanner;

public class Day04_반복문2 {

	public static void main(String[] args) {
		//어떤수 N을 입력받아
		//1부터 N까지의 합을 구하는데
		//홀수 : +
		//짝수 : -
		//출력) +1-2+3-4+5-6 = -3
		
		int N;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N:");
		N = sc.nextInt();
		for(int i = 1; i<=N; i++ ) {
			if(i%2==1){//홀
				System.out.print("+" + i );
				//sum+=i;  //sum = sum + i
			}else {//짝
				System.out.print("-" + i);
				//sum-=i;
			}
		}
		System.out.println("=" + sum );
	}
}







