package ch19;


class Bank{
	
	private int money = 10000;
	
	public synchronized void saveMoney(int save) {
		int m = getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(save+m);
	}
	public synchronized void minusMoney(int minus) {
		int m = getMoney();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(m-minus);
	}
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}

class Park extends Thread{
	public void run() {
		System.out.println("start save");
		SyncMain.bk.saveMoney(3000);
		System.out.println("saveMoney(3000) : "+SyncMain.bk.getMoney());
	}
}
class ParkWife extends Thread{
	public void run() {
		System.out.println("start minus");
		SyncMain.bk.minusMoney(2000);
		System.out.println("minusMoney(2000) : "+SyncMain.bk.getMoney());
	}
}
public class SyncMain {
	public static Bank bk = new Bank();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		ParkWife pwife = new ParkWife();
		pwife.start();
	}

}
