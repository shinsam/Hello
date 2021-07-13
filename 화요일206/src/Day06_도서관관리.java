
public class Day06_도서관관리 {

	public static void main(String[] args) {

		//Book 객체 생성
		MyBook book1 = new MyBook();
		book1.name = "Java가 너무 좋아요";
		book1.count = 10; 
		
		book1.printBookCount();
		//1권 대출
		book1.loanBook();
		//2권 반납
		book1.returnBook();
		book1.returnBook();
		//3권 대출
		book1.loanBook(3);

		
	}

}
