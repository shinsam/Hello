
public class Day06_���������� {

	public static void main(String[] args) {

		//Book ��ü ����
		MyBook book1 = new MyBook();
		book1.name = "Java�� �ʹ� ���ƿ�";
		book1.count = 10; 
		
		book1.printBookCount();
		//1�� ����
		book1.loanBook();
		//2�� �ݳ�
		book1.returnBook();
		book1.returnBook();
		//3�� ����
		book1.loanBook(3);

		
	}

}
