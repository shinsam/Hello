public class CatCat {
	   //������--------------------------------------
	CatCat(){
	    count++;
  }
	CatCat(String name, int age){
    	 this.name = name;
    	 this.age = age;
     
  }
    //�ɹ�����-----------------------------------------
    String name;
    int age;
    static int count;

    //�޼ҵ�-------------------------------------------
    void print() {
        System.out.println(name + ":"+ age +"��");
    }
    
    void print(String newName) {
    	this.name = newName;
    	print();
    }
    
    static void printCount() {
    	System.out.println("���� �� ������" + count);
    	
    }
}
