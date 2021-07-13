
public class Dog {
	
	Dog(String breed,int age, String color  ){
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
		
	String breed ;
	int age;
	String color;
	
	void barking() {
		System.out.println(breed + "is barking");
	}
	
	void hungry() {
		System.out.println(breed + "is hungry");
	}
	
	void sleeping() {
		System.out.println(breed + "is sleeping");
	}
	
	String toPrint() { //(Çªµé, 1, ¿À·»Áö)
		String str = "(" + breed + "," + age + "," + color + ")" ;
		
		return  str;
	}
}
