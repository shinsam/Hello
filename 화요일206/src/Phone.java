
public class Phone {
//������
	Phone(){
		total++;
	}
	Phone(String company, String model, int price ){
		this();
		this.company = company;
		this.model = model;
		this.price = price;
	}
	
//�������
	String model;
	int price;
	static int total;
	String company;
	
		
//��� �޼ҵ�
	String toPrint() {//����� ��Ÿ�Ϸ� ���� ��ȯ
		//String str = this.price +"����¥�� "+ this.model + "����Ʈ��" ;
		String str  = this.company + " " + this.model + " " + this.price + "����";
		return str;
	}
	void printTotal() {
		System.out.println("���� �� " + total +"�� �������.");	
	}
}

////4. ������(company) �� ������ ����Ҽ� �ֵ��� ���α׷��� �����ϼ���
////��¿���) 
//100����¥�� ����������Ʈ��== >
//���� ������ 100���� 





























