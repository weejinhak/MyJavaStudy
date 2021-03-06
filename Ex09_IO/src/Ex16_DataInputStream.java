import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex16_DataInputStream {

	public static void main(String[] args) {
		int sum=0;
		int score=0;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try{
			fis = new FileInputStream("score.txt");
			dis = new DataInputStream(fis);
			while(true){
				score = dis.readInt();
				System.out.println("Score Int 타입 :" + score);
				sum+=score;
			}
			
		}catch (Exception e) {
			System.out.println("예외발생 : " + e.getMessage());
			System.out.println("sum 결과 : " + sum);
			
		}finally {
			try {
				dis.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}


//문자열
//12,35,12,5,4
//1,2,3,4,5
//split 사용 [1][2][3][4][5]
