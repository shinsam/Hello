
public class Day06_Book활용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book();
		b1.name = "Java 그것을 알려주마";
		b1.price = 25000;
		b1.author = "김로보" ;
		b1.printBook();
		b1.discountBook();  //10%
		b1.discountBook(50);//50%
		b1.discountBook();  //10%
		
	}

}
