package kr.or.kosta;
class T extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 2000; i++) {
            System.out.println("������");
            try {
                if (Thread.interrupted()) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("�ڿ� ����");
        System.out.println("���� ����");
    }
}
 
public class ThreadEx2 {
    public static void main(String[] args) {
 
        T t = new T();
        t.start();
 
        t.interrupt();
    }
}
 


