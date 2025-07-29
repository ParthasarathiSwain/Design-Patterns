package Singleton;
//Singleton java with Minimum standards
public class Printer {

	//private static reference variable
	private static Printer INSTANCE;

	//private 0-param constructor
	private Printer() {

	}

	/*//public static factory method having singleton logic
	public static Printer getInstance() {
		if (INSTANCE==null) {
			INSTANCE=new Printer();
		}
		return INSTANCE;
	}*/

	/*//public synchronized static factory method having singleton logic
	public synchronized static Printer getInstance() {
		if (INSTANCE==null) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			INSTANCE=new Printer();
		}
		return INSTANCE;
	}*/
	/*//public  static factory method having singleton logic in synchronized block
	public  static Printer getInstance() {
		synchronized(Printer.class) {//class level locking (static properties will be locked)
			if (INSTANCE==null) {
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				INSTANCE=new Printer();
			}
			return INSTANCE;
		}*/
	
	//public  static factory method having singleton logic in synchronized block with double null check
		public  static Printer getInstance() {
			if(INSTANCE==null) {//1st null check
				System.out.println("Printer.getInstance() ::(Outside synchronized Block) "+Thread.currentThread().getName());
				synchronized(Printer.class) {//class level locking (static properties will be locked)
					System.out.println("Printer.getInstance() ::(Inside synchronized Block) "+Thread.currentThread().getName());
					if (INSTANCE==null) {//2nd null check
						try {
							Thread.sleep(3000);
						} catch (Exception e) {
							e.printStackTrace();
						}
						INSTANCE=new Printer();
					}
					
				}
			}
			return INSTANCE;
	}
}
