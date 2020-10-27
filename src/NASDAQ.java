public class NASDAQ implements Market {
	@Override
	public void buy(Stock s) {
		System.out.println("Bought " + s.toString() + " on NASDAQ Stock Market.");
	}

	@Override
	public void sell(Stock s) {
		System.out.println("Sold " + s.toString() + " on NASDAQ Stock Market.");
	}
}
