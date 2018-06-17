package deduction;

import bean.Card;
import bean.Trade;

public class FreeDeduction implements IDeduction {

	@Override
	public boolean exec(Card card, Trade trade) {
		card.deductionFreeMoney(trade.getAmount());
		return true;
	}

}
