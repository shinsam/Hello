import java.util.Scanner;

public class Day03_�����Ѱ��� {

	public static void main(String[] args) {
		int a,b;
		String op;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("����:");
			a = sc.nextInt();
			if(a==0) {
				System.out.println("Bye~");
				break;
			}
			System.out.print("����:");
			b = sc.nextInt();
			System.out.print("������:");
			op = sc.next();
			
			if(op.equals("+")) 				System.out.println(a + "+" + b + "=" + (a+b) );
			else if(op.equals("-"))			System.out.println(a + "-" + b + "=" + (a-b) );
			else if(op.equals("*"))			System.out.println(a + "*" + b + "=" + (a*b) );
			else if(op.equals("/"))			System.out.println(a + "/" + b + "=" + (a/b) );
		}
	}
}
