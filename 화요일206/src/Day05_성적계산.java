import java.util.Scanner;

public class Day05_성적계산 {

	public static void main(String[] args) {
		//5명 학생들의 성적을 입력 받아서 배열에
		//저장하고, 합계와 평균을 계산하여 출력하는 프로그램을 작성해보자
		
		int score[] = new int[5];
		int sum = 0;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		//입력:
		for(int i = 0; i < 5 ; i++) {
			System.out.print("입력:");
			score[i] = sc.nextInt();
			sum = sum + score[i];
		}
		
		System.out.print("합계:" + sum);
		avg = sum / 5.0 ;
		System.out.printf("평균:%.2f" , avg);

	}

}
