package kr.or.kosta;

public class ThreadEx {

	public static void main(String[] args) {
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		
		ThreadGroup subGrp1 = new ThreadGroup(grp1, "subGrp1");
		
		grp1.setMaxPriority(3);
		
	   Runnable r =	new Runnable() {
			public void run() {
				try{
						Thread.sleep(1000);
				}catch (InterruptedException e) {
					// TODO: handle exception
				}
			}
		};
		
		new Thread(grp1,r,"th").start();
		new Thread(subGrp1,r,"th2").start();
		new Thread(grp2,r,"th3").start();
		System.out.println("List of ThreadGroup :" + main.getName());
		System.out.println("Active ThreadGroup :" + main.activeGroupCount());
		System.out.println("Active Thread :" + main.activeCount());
		main.list();
	}

}
