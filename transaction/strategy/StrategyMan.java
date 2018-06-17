package strategy;

public enum StrategyMan {
	
	SteadyDeduction("deduction.SteadyDeduction"),
	FreeDeduction("deduction.FreeDeduction");
	
	private String value = "";
	
	StrategyMan(String value){
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}
