//�θ�
public class Circle {
	//������
	Circle(){} //�⺻��
	Circle(double r ){
		this.r = r;
	}
	
	//�������
	double r;
	
	//���� ���� : r*r*3.14
	double calArea() {
		return r*r*3.14;
	}
	
	//���� �ѷ� : 2*r*3.14
	double calRound() {
		return 2*r*3.14;
	}
	
}
