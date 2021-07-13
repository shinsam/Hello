public class CatCat {
	   //생성자--------------------------------------
	CatCat(){
	    count++;
  }
	CatCat(String name, int age){
    	 this.name = name;
    	 this.age = age;
     
  }
    //맴버변수-----------------------------------------
    String name;
    int age;
    static int count;

    //메소드-------------------------------------------
    void print() {
        System.out.println(name + ":"+ age +"살");
    }
    
    void print(String newName) {
    	this.name = newName;
    	print();
    }
    
    static void printCount() {
    	System.out.println("현재 총 마리수" + count);
    	
    }
}
