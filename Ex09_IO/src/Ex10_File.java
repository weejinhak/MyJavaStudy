import java.io.File;

public class Ex10_File {

	public static void main(String[] args) {
		//System.out.println(args[0] + "/" + args[1]);
		if(args.length !=1){
			System.out.println("���� : java���ϸ� [���丮��]");
			System.exit(0);
		}
		//java Ex10_File C:\\Temp  > args[0]
		File f = new File(args[0]);
		if(!f.exists() || !f.isDirectory()){ //�������� �ʰų� ���丮 �ƴѰ��
			System.out.println("��ȿ���� ���� ���丮 �Դϴ�");
			System.exit(0);
		}
		
		//�����ϴ� ������ ���
		File[] files = f.listFiles(); //���� , ���丮
		for(int i = 0 ; i < files.length ; i++){
			String name = files[i].getName(); //���ϸ� , ������
			System.out.println(files[i].isDirectory() ? "DIR:"+name :name );
		}
	}

}
