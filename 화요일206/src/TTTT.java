public class TTTT {

	public static void main(String[] args) {
		
	    //1.기본 생성자로 고양이 만들기 
		CatCat cat1 = new CatCat();
        cat1.name = "뽀삐";
        cat1.age = 2;

        //2.뽀삐의 정보 출력
        cat1.print();
        cat1.printCount();
        
        //3.이름과 나이를 지정하면서 고양이를 만들자
        CatCat cat2 = new CatCat("구름이", 3);
        cat2.print();
        cat2.printCount();
        
        cat2.print("초롱이");
	}

}
//생산자 오버로딩
//스태틱 변수, 메소드
//메소드 오버로딩

