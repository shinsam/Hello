import java.util.Scanner;

public class Day03_제어문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		char op;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("숫자:");
			a = sc.nextInt();
			System.out.println("숫자:");
			b = sc.nextInt();
			System.out.println("연산자:");
			op = sc.next().charAt(0);
			
			switch (op) {
			case '+':
				System.out.println(a + "+" + b + "=" + (a+b));
				break;
			case '-':
				System.out.println(a + "-" + b + "=" + (a-b));
				break;
			case '*':
				System.out.println(a + "*" + b + "=" + (a*b));
				break;
			case '/':
				System.out.println(a + "/" + b + "=" + (a/b));
				break;

			default:
				break;
			}
		}
		
	}

}
