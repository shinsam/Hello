import java.util.Scanner;

public class Day01_ЦђБе {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		int sum = 0;
		float avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("NUM1 : ");
		num1 = sc.nextInt();
		
		System.out.print("NUM2 : ");
		num2 = sc.nextInt();
		
		System.out.print("NUM3 : ");
		num3 = sc.nextInt();
		
		sum = num1 + num2 + num3;
		avg = (float)sum/3 ;
		
		System.out.printf("Че:%d ЦђБе:%.1f", sum, avg);
				
		
	}

}
