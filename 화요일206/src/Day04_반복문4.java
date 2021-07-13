
public class Day04_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1~10까지의 숫자를 출력한다.
		// 5를 출력한 후 반복문을 중지한다. - break
		// 단, 3은 출력하지 않는다.
		for(int i = 1; i<=10;i++) {
			if(i==3)
				continue;
			System.out.println(i); // 출력
			if(i==5)
				break;
		}
	}
}
