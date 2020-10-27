import java.util.HashMap;

public class User implements Observer {
	private String name;
	private Market market;

	User(String name) {
		this.name = name;
	}

	public Market getMarket() {
		return market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	public void buy(Stock s) {
		this.market.buy(s);
	}

	@Override
	public void listener(Observable o) {
		System.out.println("Stock price updated: " + o.toString());
	}
}
