package date;

public class Date {

	public Date() {}
	
	public void setDate(int _day, int _month, int _year)
	{
		day = _day;
		month = _month;
		year = _year;
	}
	
	public void printDate() { System.out.println(day + "/" + month + "/" + year); }
	
	private int day;
	private int month;
	private int year;
	
}
