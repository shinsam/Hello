public class TTTT {

	public static void main(String[] args) {
		
	    //1.�⺻ �����ڷ� ����� ����� 
		CatCat cat1 = new CatCat();
        cat1.name = "�ǻ�";
        cat1.age = 2;

        //2.�ǻ��� ���� ���
        cat1.print();
        cat1.printCount();
        
        //3.�̸��� ���̸� �����ϸ鼭 ����̸� ������
        CatCat cat2 = new CatCat("������", 3);
        cat2.print();
        cat2.printCount();
        
        cat2.print("�ʷ���");
	}

}
//������ �����ε�
//����ƽ ����, �޼ҵ�
//�޼ҵ� �����ε�

