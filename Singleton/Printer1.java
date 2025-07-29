package Singleton;
//using eager instantiation
public class Printer1 {

	//private static reference variable
	private static Printer1 INSTANCE=new Printer1();

	//private 0-param constructor
	private Printer1() {
		System.out.println("Printer1 0 param cons");
	}
	public  static Printer1 getInstance() {
		return INSTANCE;
	}
	
	
}
