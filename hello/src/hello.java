/**
 * hello.java
 * 
 * @author smithc4
 * @version 1.27.16
 */

public class hello {
	public static void main(String[] args) {
		printHello(args);
	}
	public static String printHello(String[] args) {
		if(args.length == 2)
		{
			args[0] = Character.toUpperCase(args[0].charAt(0)) + args[0].substring(1).toLowerCase();
			args[1] = Character.toUpperCase(args[1].charAt(0)) + args[1].substring(1).toLowerCase();
			return ("Hello " + args[1] + ". I am " + args[0] + ". How are you today?");
		}
		else if(args.length == 1)
		{
			args[0] = Character.toUpperCase(args[0].charAt(0)) + args[0].substring(1);
			return ("Hello " + args[0] + ".");
		}
		return ("Hello Chris.");
	}
}
