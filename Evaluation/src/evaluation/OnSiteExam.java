package evaluation;

public class OnSiteExam extends Evaluation {

	public OnSiteExam() {};
	
	public void setLocation(String _location) { location = _location; }
	public String getLocation() { return location; }
	
	private String location;
}
