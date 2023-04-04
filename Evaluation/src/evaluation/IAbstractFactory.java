package evaluation;

public interface IAbstractFactory {

	public Evaluation createEvaluation(String evaluationType);
	public Evaluated createEvaluated(String evaluatedType);
	
}
