import java.io.DataOutputStream;
import java.io.FileOutputStream;

//���� ��Ʈ��
//Java API 8���� �⺻Ÿ������ (write , read) Ŭ���� 
//DataInputStream , DataOutputStream
//���� 
//��Ʈ��ũ (ä�� )
public class Ex15_DataInput_Output_Stream {
	public static void main(String[] args) {
		
		int[] score = {100,90,80,10,60};
		
		try{
				FileOutputStream fos = new FileOutputStream("score.txt");
				
				DataOutputStream dos = new DataOutputStream(fos);
				for(int i = 0 ; i < score.length ; i++){
					dos.writeInt(score[i]); //WriteInt (����)
				}
				dos.close();
				fos.close();
			
		}catch(Exception e){
			
		}

	}

}
