
public class Calculator {
	private Double operandOne = 0.0;
	private Double operandTwo = 0.0;
	private String operation = "";
	private Double total = 0.0;
	
	
	public Calculator(Double operandOne,Double operandTwo,String operation) {
		this.operandOne = operandOne;
		this.operandTwo = operandTwo;
		this.operation = operation;
	}
	public void performOperation() {
		if(this.operation == "+") {
			 this.total = this.operandOne + this.operandTwo;
		}
		if(this.operation == "-") {
			this.total = this.operandOne - this.operandTwo;
		}
		
	}
	public void getResults() {
		System.out.println(this.total);
	}
}
