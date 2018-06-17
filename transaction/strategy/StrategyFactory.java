package strategy;

import deduction.IDeduction;

public class StrategyFactory {
	
	public static IDeduction getDeduction(StrategyMan strategy) {
		IDeduction deduction = null;
		try {
			deduction = (IDeduction)Class.forName(strategy.getValue()).newInstance();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return deduction;
	}
}
