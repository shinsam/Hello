
public class MyBook {
	//�������� �ִ� å�� ���� ����Ʈ ����ϰ� �����ϴ� Ŭ����
	
	//������
	
	//�Ӽ�
	String name; //å����
	int count;   //���� �Ǽ�
	
	//�޼ҵ�
	void printBookCount() {
		System.out.println(name + ":" + count + "�� ������");
	}
	
	void loanBook() {
		System.out.println(name + ":" + "1�� ����");
		count--;
		printBookCount();
	}
	void loanBook(int c) { //c: ������ �Ǽ�
		System.out.println(name + ":" + c +"�� ����");
		count = count -c ;
		printBookCount();
	}
	
	
	void returnBook() {
		System.out.println(name + ":" + "1�� �ݳ�");
		count++;
		printBookCount();
		
	}
}






