import java.util.Scanner;

public class Day03_���2 {

	public static void main(String[] args) {
		//�Է�
		//����⵵(int year) : 2004
		//����(String MF) : �� - M , ���� -F
		//---------------
		//���̰�� : age = 2021 - 2004 + 1
		//�Է¹��� ������ if������ ó���Ͽ� 
		//���� ��� :����� 18�� ����(����)
		
		int year;
		String MF;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����⵵:");
		year = sc.nextInt();
		int age = 2021 - year + 1 ; 

		System.out.print("����:");
		MF = sc.next();
		if(MF.equals("M") || MF.equals("m")  )
			System.out.println("����� "+ age + "�� �����Դϴ�." );
		else if( MF.equals("F") )
			System.out.println("����� "+ age + "�� �����Դϴ�." );
		else
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		
	}

}
