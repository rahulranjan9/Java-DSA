package Threads;

public class BookMovieSeats {
	int totalSeats=10;
	
	synchronized void bookSeats(int seats)
	{
		if(totalSeats>=seats)
		{
			System.out.println(seats+"Seats booked");
			totalSeats -= seats;
			System.out.println("Seats left"+totalSeats);	
		}
		else
		{
			System.out.println("sorry, seats cannot be booked");
			System.out.println("seats left"+totalSeats);
		}
	}
}


class MovieBookingApp extends Thread
{
	static BookMovieSeats b;
	int seats;
	public void run() 
	{
		b.bookSeats(seats);
	}
	
	public static void main(String args[])
	{
		b= new BookMovieSeats();
		
		MovieBookingApp t1 = new MovieBookingApp();
		t1.seats=7;
		t1.start();
		
		MovieBookingApp t2 = new MovieBookingApp();
		t2.seats=7;
		t2.start();
	}
}
