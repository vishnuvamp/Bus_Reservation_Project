package bus_reserv;

import java.util.*;

public class Bus {
	static Scanner s = new Scanner(System.in);

	private int busno;
	private int capacity;
	private boolean ac;
	private String from;
	private String to;
	private String duration;
	private double price;

	Bus() {
	}

	Bus(int busno, int capacity, boolean ac, String from, String to, String duration, double price) {

		this.busno = busno;
		this.capacity = capacity;
		this.ac = ac;
		this.from = from;
		this.to = to;
		this.duration = duration;
		this.price = price;
	}

	public int getBusno() {
		return busno;
	}

	public void setBusno(int busno) {
		this.busno = busno;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bus [busno=" + busno + ", capacity=" + capacity + ", ac=" + ac + ", from=" + from + ", to=" + to
				+ ", duration=" + duration + ", price=" + price + "]";
	}

	
}
