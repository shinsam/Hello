Z8SBZZ


1:����
2:����
3:����

1:����
2:����
3:����

1:����
2:����
3:����




public class Item {
	//�������
	private String no;
	private String name;
	private int price;
	private int count;
	private static final String COMPANY="��� ȸ��";
	private static int itemCnt;
	
	//������
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
		
		
		System.out.println("�԰�: " + this.name + "," + count + "��");
		this.count += count ; //this.count = this.count + count
	}
	
	void outStore(int count) {
		if( this.count < count ) {
			System.out.println( count + "������ :" + name + "�� �������" + this.count);
		}else {
			System.out.println("���: " + this.name + "," + count + "��");
			this.count -= count;
		}
	}
	
	void toPrint() {
		System.out.print("��ǰ�ڵ�:" + no);
		System.out.print(" ��ǰ��:" + name);
		System.out.print(" ����:" + price);
		System.out.println(" ���:" + count);
		
		
	}
	
}










