package evaluation;

public class Pupil extends Evaluated 
{
	public Pupil() {};
	
	void setGrade(String _grade) { grade = _grade; }
	String getGrade() { return grade; }
	
	private String grade; 
}
