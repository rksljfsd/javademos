package setdemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MovieTest {

	public static void main(String[] args) {
		
		Set<MovieBooking> movieBookings = new TreeSet<>();
		MovieBooking booking1 = new MovieBooking("The Firm", "12:00 PM", "Max");
		booking1.bookTicket("A1");
		booking1.bookTicket("A2");
		booking1.bookTicket("A3");
		booking1.bookTicket("A4");
		
		MovieBooking booking2 = new MovieBooking("The Firm", "15:00 PM", "John");
		booking2.bookTicket("B1");
		booking2.bookTicket("B2");
		MovieBooking booking3 = new MovieBooking("The Firm", "18:00 PM", "Wilson");
		MovieBooking booking4 = new MovieBooking("The Firm", "21:00 PM", "Jack");
		MovieBooking booking5 = new MovieBooking("The Firm", "18:00 AM", "Bob");
		
		movieBookings.add(booking1);
		movieBookings.add(booking2);
		movieBookings.add(booking3);
		movieBookings.add(booking4);
		movieBookings.add(booking5);

		System.out.println(movieBookings);

		
	}
	
}
