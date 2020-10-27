public class Main {
	public static void main(String[] args) {
		Market m1 = new NASDAQ();
		User u1 = new User("Isa");
		u1.setMarket(m1);
		Stock s1 = new Stock("TESLA", 50.00);

		s1.add(u1);
		s1.setPrice(60.00);

		u1.buy(s1);
	}
}
