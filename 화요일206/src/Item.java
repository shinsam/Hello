Z8SBZZ


1:시현
2:가인
3:예림

1:가인
2:시현
3:예림

1:시현
2:현빈
3:가인




public class Item {
	//멤버변수
	private String no;
	private String name;
	private int price;
	private int count;
	private static final String COMPANY="놀러와 회사";
	private static int itemCnt;
	
	//생성자
	Item(){
		itemCnt++;
	}
	Item(String no , String name){
		this();
		this.no =no ;
		this.name = name;
	}
	Item(String no , String name, int price, int count){
		this(no,name);
		this.price = price;
		this.count = count;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public static int getItemCnt() {
		return itemCnt;
	}
	public static void setItemCnt(int itemCnt) {
		Item.itemCnt = itemCnt;
	}
	public static String getCompany() {
		return COMPANY;
	}
	
	void inStore(int count) {
		
		
		System.out.println("입고: " + this.name + "," + count + "개");
		this.count += count ; //this.count = this.count + count
	}
	
	void outStore(int count) {
		if( this.count < count ) {
			System.out.println( count + "출고실패 :" + name + "의 현재재고" + this.count);
		}else {
			System.out.println("출고: " + this.name + "," + count + "개");
			this.count -= count;
		}
	}
	
	void toPrint() {
		System.out.print("상품코드:" + no);
		System.out.print(" 상품명:" + name);
		System.out.print(" 가격:" + price);
		System.out.println(" 재고:" + count);
		
		
	}
	
}










