public class DowJones implements Market {
	@Override
	public void buy(Stock s) {
		System.out.println("Bought " + s.toString() + " on Dow Jones Stock Market.");
	}

	@Override
	public void sell(Stock s) {
		System.out.println("Sold " + s.toString() + " on Dow Jones Stock Market.");
	}
}
