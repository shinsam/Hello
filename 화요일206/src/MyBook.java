
public class MyBook {
	//도서관에 있는 책에 대한 리스트 출력하고 관리하는 클래스
	
	//생성자
	
	//속성
	String name; //책제목
	int count;   //보유 권수
	
	//메소드
	void printBookCount() {
		System.out.println(name + ":" + count + "권 보유중");
	}
	
	void loanBook() {
		System.out.println(name + ":" + "1권 대출");
		count--;
		printBookCount();
	}
	void loanBook(int c) { //c: 대출할 권수
		System.out.println(name + ":" + c +"권 대출");
		count = count -c ;
		printBookCount();
	}
	
	
	void returnBook() {
		System.out.println(name + ":" + "1권 반납");
		count++;
		printBookCount();
		
	}
}






