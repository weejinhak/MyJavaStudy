
//��� (����)
//�������� Ŭ���� ������ (����)
//���   :    ����
//is ~a  > �� ~�̴� (�������)
//has ~a > �� ~������ �ִ� (����)

//���� �����̴� (is ~a) ��� 
//���� ���̴� (x)
//���� ���� ������ �ִ� (has ~a)

//�����ڿ��� �����ϴ� �� ���� �������� �����ϰ� ��������

//�� , �ﰢ�� , �簢���� ����� �ִ�  ���赵
//���� ���� , �׸��� ����� ������
//���� (�Ϲ�ȭ , ����) : ���� , �׸���

//���� ��ǥ (x,y)
//���� ���� ������ �ִ�
//�ﰢ���� ���� ������ �ִ�
//�簢���� ���� ������ �ִ�
//has~a >class point {int x , int y}  class circle{ point p; }


//��� : (�Ϲ�ȭ -> ��üȭ)
//��� : (����   -> Ư��ȭ)


//�Ϲ�ȭ(����) : shape , point
//class shape{} , class point{}

//��üȭ(Ư��ȭ) : circle{ } , Triangle { } 

class Shape{
	String color="gold"; //����Ӽ�
	void draw(){
		System.out.println("�׸���"); //������
	}
}
class Point{
	int x;
	int y;
	
	Point(){
		//this.x = 1;
		//this.y = 2;
		this(1,2);
		//Point p = new Point(); (1,2)
	}
	Point(int x , int y){
		this.x = x;
		this.y = y;
		//Point p = new Point(10,20); (10,20)
	}

	
}

//���� ���弼�� (���� : ���� ������ �������� ������ �ְ�
//             (����� �׸��ٶ�� ����� ������ �ִ�)
//Circle c = new Circle();
class Circle extends Shape{
	//�� (������ : ���� Ư����)
	int r;
	Point center; //Point Ŭ������ Circle ������� (����)
	
	//Circle c = new Circle();
	public Circle(){
		//this.r = 50;
		//this.center = new Point(10,12);
		this(50,new Point(10,12));
	}
	public Circle(int r , Point center){
		this.r = r;
		this.center = center; //�ּҰ� 
	}
	
}

//�ﰢ���� ���弼��(���� : �ﰢ���� 3���� ���� ���� �׸���
//                 �׸��ٶ��  ����� ������ �ִ�
//Shape
//Point
//�䱸����
//�ﰢ���� �����̴� �ﰢ���� 3���� ���� ������ �ִ�
//hint) (x,y)  (x,y)  (x,y) > Point 3��
//class Triangle{}

//1.����ũ�� �ﰢ�� �����
/*class Triangle extends Shape{
	Point x = new Point(10,20);
	Point y = new Point(30,40);
	Point z = new Point(50,60);
	
	void TriangleDraw(){
		draw(); // shape
		System.out.printf("x : (%d,%d)",x.x,x.y);
		System.out.printf("y : (%d,%d)",y.x,y.y);
		System.out.printf("z : (%d,%d)",z.x,z.y);
	}
}*/
//2. ����ũ�� , ����ũ�� �ﰢ��
class Triangle extends Shape{
	Point[] pointarray; //��ü�迭 Ÿ��
	
	Triangle(){
		this.pointarray = new Point[3];
		this.pointarray[0] = new Point(10,20);
		this.pointarray[1] = new Point(30,40);
		this.pointarray[2] = new Point(50,60);
		
	}	
	Triangle(Point[] point){
		this.pointarray = point;
	}
	void TriangleDraw(){
		draw(); // shape
		for(Point point : pointarray){
			System.out.println("��ǥ:" + point.x + "/" + point.y);
		}
	}
	
}
public class Ex02_inherit_Composite {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.r);
		System.out.println(c.center.x);
		System.out.println(c.center.y);
		c.draw();
		System.out.println(c.color);
		
		//���� ���� ������ , ��ǥ���� ���� �����ϰ� �;��
		//Point point = new Point(50, 60);
		//Circle c2 = new Circle(100,point);
		
		Circle c2 = new Circle(100,new Point(50,60));
		
		Triangle t = new Triangle();
		t.TriangleDraw();
		System.out.println();
		Point[] point = {new Point(1,2),new Point(2,3),new Point(4,5)};
		Triangle t2 = new Triangle(point);
		t2.TriangleDraw();
	}

}
