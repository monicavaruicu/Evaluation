package evaluation;

public class PracticalExam extends Evaluation {

	public PracticalExam() {}
	
	public void setNecessarySupplies(String _necessarySupplies) { necessarySupplies = _necessarySupplies; }
	public String getNecessarySupplies() { return necessarySupplies; }
	
	private String necessarySupplies;
}
