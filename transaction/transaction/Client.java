package transaction;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import bean.Card;
import bean.Trade;
import strategy.DeductionFacde;

public class Client {

	public static void main(String[] args) {
		Card card = initIC();
		
		System.out.println("************************ 初始化卡信息: **********************");
		
		showCard(card);
		
		boolean flag = true;
		
		while(flag) {
			Trade trade = createTrade();
			DeductionFacde.deduct(card, trade);
			System.out.println("****************** 交易凭证 ×××××××××××××××××××××××");
			System.out.println("本次发生的交易金额为: " + trade.getAmount()/100.0 + " 元");
			showCard(card);
			System.out.println("是否需要退出？（Y/N）");
			if(getInput().equalsIgnoreCase("Y")) {
				flag = false;
			}
		}
		System.out.println("欢迎下次继续使用本系统!");
	}

	
	private static Card initIC() {
		Card card = new Card();
		
		card.setCardNo("11000100001000");
		
		card.setSteadyMoney(100000);
		
		card.setFreeMoney(80000);
		
		return card;
	}
	
	private static Trade createTrade() {
		Trade trade = new Trade();
		
		System.out.print("请输入交易编号: ");
		
		trade.setTradeNo(getInput());
		
		System.out.print("请输入交易金额: ");
		
		trade.setAmount(Integer.parseInt(getInput()));
		return trade;
	}
	
	public static void showCard(Card card) {
		System.out.println("IC卡编号: " + card.getCardNo());
		System.out.println("固定类型金额: "+ card.getSteadyMoney()/100.0 + " 元");
		System.out.println("自由类型金额: " + card.getFreeMoney()/100.0 + " 元");
	}
	
	
	private static String getInput() {
		String str = "";
		try {
			str = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return str;
	}

}
