
public class Day08_�޼ҵ�����ε� {

	public static void main(String[] args) {

		Add obj = new Add();
		System.out.println(         obj.sum(5, 8)               );
		System.out.println(         obj.sum("����","�κ���" )       );
	}
}


class Add{

	// sum 3+5 = 8
	int sum(int a, int b) {
		return a+b;
	}
		
	// sum "����" + "�κ���" ="����κ���"
	String sum(String a, String b) {
		return a + b;
	}
		
}