import java.io.DataOutputStream;
import java.io.FileOutputStream;

//보조 스트림
//Java API 8가지 기본타입으로 (write , read) 클래스 
//DataInputStream , DataOutputStream
//보조 
//네트워크 (채팅 )
public class Ex15_DataInput_Output_Stream {
	public static void main(String[] args) {
		
		int[] score = {100,90,80,10,60};
		
		try{
				FileOutputStream fos = new FileOutputStream("score.txt");
				
				DataOutputStream dos = new DataOutputStream(fos);
				for(int i = 0 ; i < score.length ; i++){
					dos.writeInt(score[i]); //WriteInt (정수)
				}
				dos.close();
				fos.close();
			
		}catch(Exception e){
			
		}

	}

}
