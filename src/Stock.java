import java.util.ArrayList;

public class Stock implements Observable {
	private String name;
	private Double price;
	private ArrayList<Observer> observers = new ArrayList<>();

	Stock(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Double price) {
		this.price = price;
		this.notifyObservers();
	}

	@Override
	public void add(Observer o) {
		observers.add(o);
	}

	@Override
	public void remove(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.listener(this);
		}
	}

	@Override
	public String toString() {
		return "Name: " + this.name + ", Price: " + this.price;
	}
}
