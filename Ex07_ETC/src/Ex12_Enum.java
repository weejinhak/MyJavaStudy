
//1. �ý��� ��ü ���Ǵ� ��Ģ���� �ڿ�
//2. ������ �ִ� ������ ���� ǥ��
//3. ��~�� , ���� , ���� , �ڵ强 ������
//������ static final -> Interface  ��ü ����
//ȿ�� : ���α׷��� ������ 

enum Season2{ SPRING, SUMMER , FALL , WINTER }

class KostaInfo{
	String classcode;
	String classname;
	Season2 kostaseason; 
	
	KostaInfo(String classcode , String classname, Season2 kostaseason){
		this.classcode = classcode;
		this.classname = classname;
		this.kostaseason = kostaseason;
	}
}

public class Ex12_Enum {

	public static void main(String[] args) {
		KostaInfo javaclass = new KostaInfo("151th", "java", Season2.WINTER);
		System.out.println("��� : " + javaclass.classcode);
		System.out.println("�̸� : " + javaclass.classname);
		System.out.println("���� : " + javaclass.kostaseason);

	}

}
