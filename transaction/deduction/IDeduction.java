package deduction;

import bean.Card;
import bean.Trade;

public interface IDeduction {
	
	public boolean exec(Card card, Trade trade);
}
