import javax.swing.JOptionPane;

//�ܾ� ���߱� ����
//������ ����

//������ �ð��� �ο� 

//�ܾ �Է¹޴� ���ÿ� �ð��� �귯���⸦ ���ؿ�
//�ܾ� �Է� �ϰ� Ȯ�� (���)
//�ð��� üũ�ؼ� ó�� (���)

public class Ex03_Single_word_game {

	public static void main(String[] args) {
		
		String inputdata =JOptionPane.showInputDialog("���� �Է��ϼ���");
		System.out.println("�Է��� ���� : " + inputdata);
		
		Timer();
	}
	static void Timer(){
		for(int i =10 ; i > 0 ; i--){
			System.out.println("���� �ð� : " + i);
			try{
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}


