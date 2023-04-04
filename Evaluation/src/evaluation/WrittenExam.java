package evaluation;

public class WrittenExam extends Evaluation {

	public WrittenExam() {}
	
	public void setNoOfExercises(int _noOfExercises) { noOfExercises = _noOfExercises; } 
	public int getNoOfExercises() { return noOfExercises; }
	
	private int noOfExercises;
}
