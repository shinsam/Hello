//
//public class PizzaMain {
//
//	public static void main(String[] args) {
//
//		Pizza  pizza1 = new Pizza();
//		pizza1.setSize(12);
//		pizza1.setType("���۽�����");
//		pizza1.toPrint();
//		
//		
//		
//		
//	}
//}
//


public class PizzaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza pizza1 = new Pizza();
		pizza1.size = 12;
		pizza1.setType("���۽�����");
		
		Pizza pizza2 = new Pizza("��������");
		pizza2.setSize(24);
				
		Pizza pizza3 = new Pizza(12, "�Ұ��");
		
		pizza1.toPrint();
		pizza2.toPrint();
		pizza3.toPrint();
		
	}

}
