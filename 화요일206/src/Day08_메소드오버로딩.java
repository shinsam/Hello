
public class Day08_메소드오버로딩 {

	public static void main(String[] args) {

		Add obj = new Add();
		System.out.println(         obj.sum(5, 8)               );
		System.out.println(         obj.sum("서울","로봇고" )       );
	}
}


class Add{

	// sum 3+5 = 8
	int sum(int a, int b) {
		return a+b;
	}
		
	// sum "서울" + "로봇고" ="서울로봇고"
	String sum(String a, String b) {
		return a + b;
	}
		
}