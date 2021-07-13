
public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Item.getCompany() + "오신것을 환영합니다!!!!!!" );
		System.out.println("우리회사 현재 상품 개수 :" + Item.getItemCnt());
		
		Item item1 = new Item();
		item1.setNo("100");
		item1.setName("연필");
		item1.setPrice(6000);
		item1.setCount(5);
		
		Item item2 = new Item("101", "노트");
		item2.setPrice(1000);
		item2.setCount(4);

		Item item3 = new Item("102", "지우개",500, 5);
		System.out.println("========"+  Item.getCompany()    +"==============");
		item1.toPrint();
		item2.toPrint();
		item3.toPrint();
		
		System.out.println("우리회사 현재 상품 개수 :" + Item.getItemCnt());
		System.out.println("======================");
		item1.inStore(10);
		item2.inStore(20);
		item2.outStore(5);
		item3.inStore(20);
		item3.outStore(30);
		System.out.println("======================");
		item1.toPrint();
		item2.toPrint();
		item3.toPrint();
		
		item2.inStore(10);
		item2.outStore(100);
		//입고: 노트,10개
		//출고: 노트,100개
		
	}

}
