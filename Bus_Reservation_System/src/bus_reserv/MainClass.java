package bus_reserv;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		ArrayList<Bus> buses = new ArrayList<Bus>();
		buses.add(new Bus(1, 2, false, "Chennai", "Vellore", "3hrs 30min", 150));
		buses.add(new Bus(2, 4, false, "Chennai", "Coimbatore", "7hrs 45min", 500));
		buses.add(new Bus(3, 5, true, "Chennai", "Madurai", "9hrs 15min", 750));
		buses.add(new Bus(4, 6, false, "Chennai", "Tiruchy", "6hrs 25min", 400));

		ArrayList<Booking> bookings = new ArrayList<Booking>();

		boolean b = true;

		while (b) {
			System.out.println("***Welcome to Bus Reservation App***");
			System.out.println("1.Bus Info\n2.Booking Ticket\n3.Available Bus Routes\n4.Exit\n");
			int input = s.nextInt();

			switch (input) {
			case 1: {
				for (Bus bus : buses) {
					System.out.println(bus);
				}
				break;
			}
			case 2: {
				Booking booking = new Booking();
				if (booking.isAvailable(buses, bookings)) {
					bookings.add(booking);
					System.out.println("Your Ticket is Confirmed");
				} else {
					System.out.println("Insufficient Ticket Please Try Another Date");
				}
				booking.payment(buses,bookings);
				break;
			}
			case 3: {
				System.out.println("\t\t\tAvailable Bus Routes\n");
				System.out.println("Chennai to Vellore");
				System.out.println("Chennai to Coimbatore");
				System.out.println("Chennai to Madurai");
				System.out.println("Chennai to Tiruchy\n");
				break;
			}
			case 4: {
				System.out.println("****Thank You****");
				b = false;
				break;
			}
			default: {
				System.out.println("Incorrect Input");
				break;
			}
			}

		}

	}

}
