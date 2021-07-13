
public class Day04_스트링 {

	public static void main(String[] args) {
		//스트링 풀을 이용해서 한곳을 참조하고있다.
		String a = "robot";
		String b = "robot";
		
		if(a==b)//주소가 같은가?
			System.out.println("주소가 같다.");
		else
			System.out.println("주소가 다르다.");
		
		if(a.equals(b))
			System.out.println("값이 같다.");
		else
			System.out.println("값이 다르다.");
		
		System.out.println("=====================");
		String c = new String("robot");
		if(a==c)
			System.out.println("주소가 같다.");
		else
			System.out.println("주소가 다르다.");
		
		c = "test";
		System.out.println(c);
		
		if(a.equals(c))
			System.out.println("값이 같다.");
		else
			System.out.println("값이 다르다.");
			
		
	}

}
