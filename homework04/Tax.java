package homework04;

public class Tax {
	private String name;
	private double money;
	private double per;
	
	Tax(String name, double money, double pers){
		this.name = name;
		this.money = money;
		this.per = per;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}
	
	public double result() {
		return money*10000 * per;
	}

}
