
public class Day08_CatMain {

	public static void main(String[] args) {

		//1.기본 생성자로 고양이 만들기
		Cat cat1 = new Cat();
		cat1.name = "뽀삐";
		cat1.age = 2;
		
		//2.뽀삐의 정보를 출력해보자
		cat1.print();
		cat1.printCount();
		
		//3.이름과 나이를 지정하면서 고양이를 만들자
		Cat cat2 = new Cat("구름이", 3);
		cat2.print();
		cat2.printCount();
		
		cat2.print("초롱이");
	}

}
