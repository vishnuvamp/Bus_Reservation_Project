package bus_reserv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {

	static Scanner s = new Scanner(System.in);

	private String passengername;
	private int busno;
	private Date date;

	Booking() {

		System.out.println("Enter The Passenger Name");
		String p_name = s.next();
		passengername = p_name;
		System.out.println("***Enter The Bus No***");
		System.out.println("1.Vellore\n2.Coimbatore\n3.Madurai\n4.Tiruchy\n5.Exit");
		int busno = s.nextInt();
		this.busno = busno;
		System.out.println("Enter The Date in : dd-mm-yyyy");
		String dateinput = s.next();
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
		Date date;
		try {
			date = dateformat.parse(dateinput);
			this.date = date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public String getPassengername() {
		return passengername;
	}

	public void setPassengername(String passengername) {
		this.passengername = passengername;
	}

	public int getBusno() {
		return busno;
	}

	public void setBusno(int busno) {
		this.busno = busno;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Booking [passengername=" + passengername + ", busno=" + busno + ", date=" + date + "]";
	}

	public boolean isAvailable(ArrayList<Bus> bus, ArrayList<Booking> book) {
		int capacity = 0;
		for (Bus b : bus) {
			if (b.getBusno() == busno) {
				capacity = b.getCapacity();
			}
		}
		int booked = 0;
		for (Booking b : book) {
			if (this.busno == b.getBusno() && this.date.equals(getDate())) {
				booked++;
			}

		}
		return (booked < capacity) ? true : false;
	}

	public void payment(ArrayList<Bus> buses, ArrayList<Booking> bookings) {

		System.out.println("**********************");
		boolean boo1;
		do {
			boo1 = false;
			System.out.println("Please Select Your Payment Mode");
			System.out.println("1.Phonepe\n2.Google Pay\n");
			int paymode = s.nextInt();
			if (paymode == 1)
				System.out.println("Welcome to phonepe");
			else if (paymode == 2)
				System.out.println("Welcome to Google Pay");
			else {
				System.out.println("Please Enter Valid Payment Mode");
				boo1 = true;
			}
		} while (boo1);

		for (Bus bus1 : buses) {
			if (this.busno == bus1.getBusno()) {
				System.out.println("Your Ticket Price : " + bus1.getPrice());
			}
		}
		System.out.println("Enter Your Ticket Amount");
		double t_price = s.nextInt();
		for (Bus bus2 : buses) {
			if (t_price == bus2.getPrice()) {
				System.out.println("Your Booking Was Successfull");
			}

		}

	}
}
