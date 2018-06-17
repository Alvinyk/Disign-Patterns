package bean;

public class Card {
	private String cardNo = "";
	
	private int steadyMoney = 0;
	
	private int freeMoney = 0;

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public int getSteadyMoney() {
		return steadyMoney;
	}

	public void setSteadyMoney(int steadyMoney) {
		this.steadyMoney = steadyMoney;
	}

	public int getFreeMoney() {
		return freeMoney;
	}

	public void setFreeMoney(int freeMoney) {
		this.freeMoney = freeMoney;
	}
	
	public void deductionSteadyMoney(int money) {
		this.steadyMoney -= money;
	}
	
	public void deductionFreeMoney(int money) {
		this.freeMoney -= money;
	}
}
