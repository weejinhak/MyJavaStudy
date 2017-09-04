package Project;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
 
public class Manager {
 
    static Scanner scan;
    static HashMap<Integer, M> map = new HashMap<>(); // 정수 형태의 키값과 M형태의 밸류값을
                                                        // 객체로 생성함 -> M클래스를 객체로
    static HashMap<Integer, master> mapp = new HashMap<>();// -> master 클래스를 밸류로
    static int count = 1;
    
 
    public Manager() {
 
        scan = new Scanner(System.in);
 
        while (true) { // 무한 루프해서 계속 입력 받을 수 있게 함
            System.out.println("매니저님 환영합니다");
 
            System.out.print("<1>관리자 등록 <2>알바생 등록 <3>알바생 삭제 <4>알바생 시급관리 <5>종료 : ");
 
            switch (scan.nextInt()) {
            case 1:
                manager_add(); // + 추가를 한다음에 바로 저장하는 기능을 넣으면 좋겠음 -> 자동저장 기능!
                break;
            case 2:
                part_add();
                break;
            case 3:
                part_delete();
                break;
            case 4:
                salary_print();
                break;
            case 5:
                exit();
                break;
 
            }// switch
        } // while
    }
 
/*    private void read(){
        //static HashMap<Integer, M> map = new HashMap<>(); // 정수 형태의 키값과 M형태의 밸류값을
        // 객체로 생성함 -> M클래스를 객체로
        
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis); 
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(file), "euc-kr"));
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }*/
    
    private void save() { // salary 텍스트 파일로 저장하기
        File file = new File("C:\\Temp\\salary.txt"); // default경로에 저장
        try {
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            
            ObjectOutputStream oos = new ObjectOutputStream(bos);
                                        /*BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file), "euc-kr"));
            ((ObjectOutput) osw).writeObject(mapp); // 해쉬맵으로 키와 밸류값 객체로 출력하기
*/
            oos.writeObject(mapp);
            
            fos.close();
            //writer.close();
            
 
        } catch (Exception e) {
            System.out.println("에러발생!!!"); // 파일이 없다면 에러발생시키기
            e.printStackTrace();
        }
        System.out.println("저장되었습니다.");
    }
 
    
    /*public Object undoSerializable() throws IOException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis); // -> 직렬화를 통해 객체를
                                                            // 출력하기
        BufferedInputStream bis = new BufferedInputStream(ois);
        
        return mapp;
    }*/
 
    private void salary_print() {
        // [ 업체명 / 알바생이름 / 시급 / 일한 총 일 수 / 하루 일한 시간 / 총 금액 ]
        /*
         * private String company = ""; //업체명 private String ename = ""; //알바생
         * 이름 private final int HOURSMONEY = 6500; //시급 private int day = 0;
         * //일한 총 일수 private double shour = 0; //하루 일을 시작한 시간 private double
         * ehour = 0; //하루 일을 끝낸 시간 private double pay = 0; //총 일한 시간 private
         * double sum = 0; //총 금액
         */ Set<Integer> set = map.keySet(); // 정수값으로 제너릭해준다음 키값을 셋형태(순서없고 중복없음)로
                                            // 몽땅 받아오기 -> 키는 해쉬맵에서 인티저 형태로 제너릭을
                                            // 해주었음
        System.out.println("[ 번호 \t 업체명 \t 알바생이름 \t 시급 / 일한 총 일 수 \t 하루 일한 시간 \t 총 금액  ]");
        for (Integer number : set) {
            String company = map.get(number).getCompany();
            String ename = map.get(number).getEname();
            int day = map.get(number).getDay();
            double pay = map.get(number).getPay();
            double sum = map.get(number).getSum();
 
            System.out.printf("%s\t %s\t %s\t 6500\t %d\t %d\t %.2f\t %.2f \n", number, company, ename, day, pay, sum);
        }
    }
 
    private void part_delete() {
        System.out.print("삭제하실 넘버를 입력해 주세요 : ");
        int num = scan.nextInt(); // 메뉴 번호를 입력받기
        if (map.containsKey(num)) { // 메뉴선택한 번호를 포함하고 있다면
            map.remove(num); // 맵에서 삭제해라 -> 키와 밸류 동시 삭제
            System.out.println("삭제되었습니다.");
        } else { // 포함하고 있지 않으므로 잘못입력
            System.out.println("고객넘버를 잘못입력하셨습니다. 해당 정보가 없습니다.");
        }
    }
 
    private void part_add() {
        // 업체명, 알바생 이름, 시급, 일한 시간 등 추가하기!
        // 알바생 코드 3자리 고정
 
        M m = new M(); // M 객체를 생성해서
 
        
        // 로그인 매소드 호출
        login();
 
        map.put(count, m.input(m)); // 해쉬맵으로 키와 밸류를 집어넣어 새롭게 추가해주기
        count++; // 한개씩 증가
    }
 
    private void manager_add() {
 
        master ma = new master();
        mapp.put(count, ma.input_m(ma));
        count++;
        save();
 
    }
 
    public void login() {// 업체명, 관리자 이름, 비밀번호를 입력
        master ms = new master();
        
        
    }
 
    public void exit() { // 시스텝 강제종료
        System.out.println("시스템을 종료합니다.");
        System.exit(0);
        scan.close(); // 값 입력받는 것도 그만하기
    }
    
    
    
}
