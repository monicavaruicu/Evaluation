package evaluation;

public class Student extends Evaluated {

	public Student() {};
	
	void setYearOfStudy(String _yearOfStudy) { yearOfStudy = _yearOfStudy; }
	String getYearOfStudy() { return yearOfStudy; }
	
	private String yearOfStudy; 

}
