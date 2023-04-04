package evaluation;

import date.Date;

public class Evaluation {

	public Evaluation() { date = new Date(); }
	
	public void setDate(int day, int month, int year) { date.setDate(day, month, year); }
	public Date getDate() { return date; }
	public void printDate() { date.printDate(); }
	
	public void setSubject(String _subject) { subject = _subject; }
	public String getSubject() { return subject; }
	
	private Date date;
	private String subject;
}
