
public class Day06_BookȰ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book();
		b1.name = "Java �װ��� �˷��ָ�";
		b1.price = 25000;
		b1.author = "��κ�" ;
		b1.printBook();
		b1.discountBook();  //10%
		b1.discountBook(50);//50%
		b1.discountBook();  //10%
		
	}

}
