import java.util.Map;
import java.util.Properties;

//Map ����
//Ư���� Map <String, String> 
//Properties �Ӽ�
//APP ����Ӽ� (ȯ�溯��) ���� ����
//������ Properties Ȯ���ڸ� ���� ������ ���� ����
//�ٱ��� ó�� 
//Spring ���� ...

//������ �̸��� �ּ� , �������� , �������� ������ 
public class Ex16_Properties {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("master", "korea@master.com");
		prop.setProperty("version", "1.1.0");
		prop.setProperty("defaultpath", "C:\\temp\\images");
		System.out.println("�� ����Ʈ : " + prop.getProperty("master"));
		System.out.println("���� : " + prop.getProperty("version"));
		System.out.println("Ư����� : " + prop.getProperty("defaultpath"));
	
		
	}

}
