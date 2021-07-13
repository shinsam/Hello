
public class Fish extends Animal {

	public static void main(String[] args) {
		
		Fish gold = new Fish();
		gold.name = "금붕어";
		gold.toPrint();
		
		// 업캐스팅 : 상위 <--- 하위 : 묵시적
		Animal ani = gold; 
		ani.toPrint();
		
		//eat(  Animal xxx);
		///eat(ani) ; 
		
		// 다운 캐스팅 : 하위 <-- 상위
		///Fish silver = new Animal(); 불가능
		Fish silver = (Fish)ani; //명시적
		silver.toPrint();
		
		
	}
}
