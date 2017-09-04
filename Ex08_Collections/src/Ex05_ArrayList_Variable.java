import java.util.ArrayList;

class Empdata{
	private ArrayList elist;
	private int[] numbers;
	
	public Empdata(){
		this.elist = new ArrayList();
		this.numbers = new int[10];
	}
	
	//elist (getter , setter) �Լ�
	//       getElist  setElist
	
	//numbers(getter , setter) �Լ�
	//       getNumbers   setNumbers
	public void setNumbers(int[] numbers){
		this.numbers = numbers;
	}
	public int[] getNumbers(){
		return numbers;
	}
	
	//ArrayList �� Ÿ�Դϴ�
	public void setElist(ArrayList elist){
		this.elist = elist;
	}
	public ArrayList getElist(){
		return this.elist;
	}
}


public class Ex05_ArrayList_Variable {

	public static void main(String[] args) {
		Empdata empdata = new Empdata();
		ArrayList arrlist = new ArrayList();
		arrlist.add("ȫ�浿");
		empdata.setElist(arrlist);
		
		
		ArrayList relist = empdata.getElist();
		System.out.println(relist.get(0).toString());
		System.out.println(arrlist.equals(relist));
		
	}

}
