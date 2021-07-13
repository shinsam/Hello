//자식
public class Bear extends Animal {

	//생성자
	Bear(){
		super("뽀삐",3);
		System.out.println("Bear 기본생성자");
	}
	
	
	public static void main(String[] args) {

		Bear b1 = new Bear();

	}
}
