package evaluation;

public class EvaluationFactory implements IAbstractFactory {

	@Override
	public Evaluation createEvaluation(String evaluationType) {
		
		if(evaluationType == "Online Exam")
			return new OnlineExam();
		
		if(evaluationType == "OnSite Exam")
			return new OnSiteExam();
		
		if(evaluationType == "Oral Exam")
			return new OralExam();
		
		if(evaluationType == "Practical Exam")
			return new PracticalExam();
		
		if(evaluationType == "Written Exam")
			return new WrittenExam();
		
		return null;
	}

	@Override
	public Evaluated createEvaluated(String evaluatedType) {
		
		if(evaluatedType == "Pupil")
			return new Pupil();
		
		if(evaluatedType == "Student")
			return new Student();
		
		if(evaluatedType == "Master Student")
			return new MasterStudent();

		if(evaluatedType == "Employee")
			return new Employee();

		return null;
	}

}
