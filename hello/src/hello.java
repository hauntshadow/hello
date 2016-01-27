/**
 * hello.java
 * 
 * @author smithc4
 * @version 1.27.16
 */

public class hello {
	public static void main(String[] args) {
		if(args.length > 0)
		{
			System.out.println("Hello " + args[0] + ".");
		}
		else
		{
			System.out.println("Hello Chris.");
		}
	}
}
