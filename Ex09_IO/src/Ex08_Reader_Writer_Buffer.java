import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//���� �ٷꋚ�� Buffer (I/O) ����
//buffer ���� : Line() ���� ó�� ����
public class Ex08_Reader_Writer_Buffer {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try{
				fr = new FileReader("Ex01_Stream.java");
				br = new BufferedReader(fr);
				String line="";
				for(int i = 0 ; (line = br.readLine()) != null ; i++){
					//System.out.println(line);
					//QUIZ (;) �����ݷ��� �ִ� ���常 ����ϼ���
					if(line.indexOf(";") != -1){
						System.out.println(line);
					}
				}
				
		}catch(Exception e){
			
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
