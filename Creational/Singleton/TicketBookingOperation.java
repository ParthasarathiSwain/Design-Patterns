package Singleton;

public class TicketBookingOperation implements Runnable {

	@Override
	public void run() {
		System.out.println("TicketBookingOperation.run()");
		//Printer p=Printer.getInstance();
		Printer1 p1=Printer1.getInstance();
		System.out.println(p1.hashCode());
	}

}
