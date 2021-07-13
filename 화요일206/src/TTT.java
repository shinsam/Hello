public class TTT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Q1==============================");
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=3; j++)
				System.out.print(j);
			System.out.println();
		}
		
		System.out.println("Q2==============================");
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=3; j++)
				System.out.print(i);
			System.out.println();
		}
		
		System.out.println("Q3==============================");
		for(int i = 1; i<=4; i++) {
			for(int j = 1; j<=i; j++)
				System.out.print(j);
			System.out.println();
		}
		
		System.out.println("Q4==============================");
		for(int i = 3; i>=1; i--) {
			for(int j = i; j>=1; j--)
				System.out.print(j);
			System.out.println();
		}
	}
}
