package strategy;

import bean.Card;
import bean.Trade;
import deduction.DeductionContext;
import deduction.IDeduction;

public class DeductionFacde {

	public static Card deduct(Card card, Trade trade) {
		
		StrategyMan reg = getDeductionType(trade);
		
		IDeduction deduction = StrategyFactory.getDeduction(reg);
		
		DeductionContext context = new DeductionContext(deduction);
		
		context.exec(card, trade);
		
		return card;
	}
	
	
	public static StrategyMan getDeductionType(Trade trade) {
		if(trade.getTradeNo().contains("abc")) {
			return StrategyMan.FreeDeduction;
		}else {
			return StrategyMan.SteadyDeduction;
		}
	}
}
