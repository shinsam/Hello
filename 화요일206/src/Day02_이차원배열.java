import java.util.Iterator;

public class Day02_이차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//29p 1-16 예제
		int a[][] = new int[][]{{1,2,3}, {10,20,30,8,8,8,8,8}} ;
				
		for (int i = 0; i < a.length; i++) {
			for(int j = 0 ; j < a[i].length; j++ )
				System.out.println(a[i][j]);
		}
		
		double q = 3.3 % 2.1 ;
		System.out.println(q);
		System.out.println(3>2);
	}

}
