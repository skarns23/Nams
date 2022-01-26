package mydate;

class MyDate{
	int day;
	int month;
	int year;
	public MyDate(int day,int month,int year) {
		this.day = day;
		this.month=month;
		this.year =year;
	}
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate date = (MyDate)obj;
			if(this.year==date.year &&this.month==date.month &&this.day ==date.day)
				return true;
		}
		else
			return false;
		return false;
	}
}
public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(9,18,2004);
		MyDate date2 = new MyDate(9,18,2004);
		System.out.println(date1.equals(date2));
	}

}
