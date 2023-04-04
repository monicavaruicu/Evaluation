package evaluation;

public class MainClass {

	public static void main(String[] args) {
		EvaluationFactory factory = new EvaluationFactory();
		
		Evaluation WrittenExam = factory.createEvaluation("Written Exam");
		Evaluation PracticalExam = factory.createEvaluation("Practical Exam");
		
		Evaluated Student = factory.createEvaluated("Student");
		Evaluated Employee = factory.createEvaluated("Employee");
		
		System.out.println(WrittenExam.getClass());
		System.out.println(PracticalExam.getClass());
		System.out.println(Student.getClass());
		System.out.println(Employee.getClass());
		
	}

}
