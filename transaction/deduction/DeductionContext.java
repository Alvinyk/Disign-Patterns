package deduction;

import bean.Card;
import bean.Trade;

public class DeductionContext {
	private IDeduction deduction = null;
	
	public DeductionContext(IDeduction _deduction) {
		this.deduction = _deduction;
	}
	
	public boolean exec(Card card, Trade trade) {
		return this.deduction.exec(card, trade);
	}
}
