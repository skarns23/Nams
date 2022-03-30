package ch18;

import java.io.IOException;

public class TerminateThread extends Thread{
	
	
	private boolean flag = false;
	int i;
	
	public TerminateThread(String nm) {
		super(nm);
	}
	
	public void run() {
		while(!flag) {
			try {
				System.out.print(this.getName()+" ");
				sleep(100);
			}catch (Exception e) {
				
			}
		}
		System.out.println(getName() +" end");
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TerminateThread A = new TerminateThread("A");
		TerminateThread B = new TerminateThread("B");
		TerminateThread C = new TerminateThread("C");
		
		A.start();
		B.start();
		C.start();
		int in;
		while(true) {
			in = System.in.read();
			switch (in) {
			case 'A':
				A.setFlag(true);
				break;
			case 'B':
				B.setFlag(true);
				break;
			case 'C':
				C.setFlag(true);
				break;
			case 'M':
				A.setFlag(true);
				B.setFlag(true);
				C.setFlag(true);
				break;
			}
		}
	}

}
