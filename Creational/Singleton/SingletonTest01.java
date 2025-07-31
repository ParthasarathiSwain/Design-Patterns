package Singleton;

public class SingletonTest01 {
	public static void main(String[] args) {
		//get Singleton java class object
		Printer p1=Printer.getInstance();
		Printer p2=Printer.getInstance();
		System.out.println("Hash Code :: "+p1.hashCode()+" , "+p2.hashCode());
		System.out.println("(p1==p2)? "+(p1==p2));
	}
}
