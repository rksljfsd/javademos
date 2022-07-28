package setdemo;

import java.util.ArrayList;
import java.util.List;

public class MovieBooking implements Comparable<MovieBooking> {

	Movie movie;
	User user;
	String showTime;
	String userName;
	List<String> mytickets;

	public MovieBooking(String moviename, String showTime, String username) {
		this.movie.name = moviename;
		this.showTime = showTime;
		this.userName = username;
		this.mytickets = new ArrayList<>();
	}

	public void bookTicket(String seatNo) {
		this.mytickets.add(seatNo);
	}

	public String toString() {
		return "\nUser: " + userName + ",MovieName: " + this.movieName + ",Time: " + this.showTime + ", Tickets: "
				+ mytickets;
	}

	@Override
	public int compareTo(MovieBooking o) {
		return this.showTime.compareTo(o.showTime);
	}

}
