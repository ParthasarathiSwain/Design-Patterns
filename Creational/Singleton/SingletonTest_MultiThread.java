package Singleton;

public class SingletonTest_MultiThread {
	public static void main(String[] args) {
		TicketBookingOperation operation=new TicketBookingOperation();
		Thread t1=new Thread(operation);
		Thread t2=new Thread(operation);
		Thread t3=new Thread(operation);
		
		/*t1.start();
		t2.start();
		try {
			Thread.sleep(20000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		t3.start();*/
		
		try {
			Class.forName("Singleton.Printer1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
