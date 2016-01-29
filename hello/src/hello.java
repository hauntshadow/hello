/**
 * hello.java
 * 
 * @author smithc4
 * @version 1.27.16
 */

public class hello {
	public static void main(String[] args) {
		if(args.length == 2)
		{
			args[0] = Character.toUpperCase(args[0].charAt(0)) + args[0].substring(1).toLowerCase();
			args[1] = Character.toUpperCase(args[1].charAt(0)) + args[1].substring(1).toLowerCase();
			System.out.println("Hello " + args[1] + ". I am " + args[0] + ". How are you today?");
		}
		else if(args.length == 1)
		{
			args[0] = Character.toUpperCase(args[0].charAt(0)) + args[0].substring(1);
			System.out.println("Hello " + args[0] + ".");
		}
		else
		{
			System.out.println("Hello Chris.");
		}
	}
}
