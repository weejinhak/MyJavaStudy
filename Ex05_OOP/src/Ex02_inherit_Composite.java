
//상속 (기준)
//여러개의 클래스 있을때 (관계)
//상속   :    포함
//is ~a  > 은 ~이다 (상속정의)
//has ~a > 은 ~가지고 있다 (포함)

//원은 도형이다 (is ~a) 상속 
//원은 점이다 (x)
//원은 점을 가지고 있다 (has ~a)

//공통자원을 추출하는 것 보다 여러개의 나열하고 공통추출

//원 , 삼각형 , 사각형을 만들수 있는  설계도
//공통 색상 , 그리다 기능을 가진다
//도형 (일반화 , 공통) : 색상 , 그리다

//점은 좌표 (x,y)
//원은 점을 가지고 있다
//삼각형은 점을 가지고 있다
//사각형은 점을 가지고 있다
//has~a >class point {int x , int y}  class circle{ point p; }


//상속 : (일반화 -> 구체화)
//상속 : (공통   -> 특수화)


//일반화(공통) : shape , point
//class shape{} , class point{}

//구체화(특수화) : circle{ } , Triangle { } 

class Shape{
	String color="gold"; //공통속성
	void draw(){
		System.out.println("그리다"); //공통기능
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

//원을 만드세요 (정의 : 원은 한점과 반지름을 가지고 있고
//             (색상과 그리다라는 기능을 가지고 있다)
//Circle c = new Circle();
class Circle extends Shape{
	//원 (반지름 : 원의 특수성)
	int r;
	Point center; //Point 클래스가 Circle 멤버변수 (포함)
	
	//Circle c = new Circle();
	public Circle(){
		//this.r = 50;
		//this.center = new Point(10,12);
		this(50,new Point(10,12));
	}
	public Circle(int r , Point center){
		this.r = r;
		this.center = center; //주소값 
	}
	
}

//삼각형을 만드세요(정의 : 삼각형은 3개의 점과 색상 그리고
//                 그리다라는  기능을 가지고 있다
//Shape
//Point
//요구사항
//삼각형은 도형이다 삼각형은 3개의 점을 가지고 있다
//hint) (x,y)  (x,y)  (x,y) > Point 3개
//class Triangle{}

//1.고정크기 삼각형 만들기
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
//2. 고정크기 , 변동크기 삼각형
class Triangle extends Shape{
	Point[] pointarray; //객체배열 타입
	
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
			System.out.println("좌표:" + point.x + "/" + point.y);
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
		
		//저는 원의 반지름 , 좌표값을 제가 설정하고 싶어요
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
