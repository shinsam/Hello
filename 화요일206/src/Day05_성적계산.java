import java.util.Scanner;

public class Day05_������� {

	public static void main(String[] args) {
		//5�� �л����� ������ �Է� �޾Ƽ� �迭��
		//�����ϰ�, �հ�� ����� ����Ͽ� ����ϴ� ���α׷��� �ۼ��غ���
		
		int score[] = new int[5];
		int sum = 0;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		//�Է�:
		for(int i = 0; i < 5 ; i++) {
			System.out.print("�Է�:");
			score[i] = sc.nextInt();
			sum = sum + score[i];
		}
		
		System.out.print("�հ�:" + sum);
		avg = sum / 5.0 ;
		System.out.printf("���:%.2f" , avg);

	}

}
