
public class Day02_참조형배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[4];
		int []b = new int[] {21,22,23,24};
		int []c = {31,32,33};
		
		for(int i= 0 ; i < c.length; i++)
			System.out.println(c[i]);
		System.out.println("------");
		//b의 주소를 c에게 저장
		c = b;
		for(int i= 0 ; i < c.length; i++)
			System.out.println(c[i]);
		
		System.out.println("------");
		b[0] = 999;
		c[1] = 777;
		for(int i= 0 ; i < c.length; i++)
			System.out.println(c[i]);
		
	}

}
