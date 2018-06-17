package deduction;

import bean.Card;
import bean.Trade;

public class SteadyDeduction implements IDeduction {

	@Override
	public boolean exec(Card card, Trade trade) {
		
		int halfMoney = (int) Math.rint(trade.getAmount() / 2.0);
		card.deductionSteadyMoney(halfMoney);
		card.deductionFreeMoney(halfMoney);
		return true;
	}

}
