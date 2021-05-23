package core.model;

public class CalModel {
	
	public int calculate(int val1, String operande, int val2) {
		int result;
		switch (operande) {
		case "+":
			result = val1 + val2;
			break;
		case "-":
			result = val1 - val2;
			break;
		case "*":
			result = val1 * val2;
				break;
		case "/":
			result = val1 / val2;
				break;
		default:
			throw new RuntimeException("impossible operator");
		}
		return result;
	}

}
