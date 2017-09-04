import java.io.File;

//���� �Ǵ� ����(directory) �ٷ�� Ŭ����
//MS(c#) > File , Directory
//java   > File �ϳ��� 2���� ��Ȱ

//File Ŭ����
//���� ����, ���� , ����
//���� ���� , ���� 

//���
//������ : C:\ , D:\  C:\\Temp\\a.txt
//����� : ���� ��ġ

//File Ŭ���� (���� ǥ��) get...
public class Ex09_File {
	public static void main(String[] args) {
	  String path = "C:\\Temp\\file.txt";
	  File f = new File(path); //file.txt ���� ����
	  
	  String filename = f.getName();
	  System.out.println("���ϸ� : " + filename);
	  
	  //���� ����
	  //f.delete(); return true , false
	  //filename (���ϸ�, Ȯ����)
	  //�ΰ��� �O�ƺ�����
	  
	  System.out.println("��ü ��� : " + f.getPath());
	  System.out.println("���� ��� : " + f.getAbsolutePath());
	  System.out.println("�� ������ : " + f.isDirectory());
	  System.out.println("�� �����̴� : " + f.isFile());
	  System.out.println("������ ũ�� : " + f.length() + "byte");
	  System.out.println("�θ��� : " + f.getParent());
	  System.out.println("���� ���� ���� : " + f.exists());

	}

}
