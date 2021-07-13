
public class Day01_변수 {

	public static void main(String[] args) {
		System.out.println("변수의 형변환");
		int a =  2121212121;
		long b = 9898098808121212L;     // L
		float c = 12345.12321231F;		// F
		double d = 12321313.123123123123123 ;
		
		//강제형변환
		a = (int)b ; //LONG==> INT
		System.out.println(a);
		c = (float)d;
		System.out.println(c);
		
		//문자와 문자열 char arr[10]
		String 문자열="신경화";
		System.out.println(문자열);
	}
	
}

// 취업 
// 1학년
// 2학년 -자격증 미리미리  
// 3학년 -맞춤형 취업 프로그램?특강?







