package Demo;

public class CommandLineArgsDemo2 {
	public static void main(String[] args)
	   {
		int n1, n2;
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);

		int sum = n1+n2;

		System.out.println("\n\t n1 = " + n1);
		System.out.println("\n\t n2 = " + n2);
		System.out.println("\n\t sum = " + sum);
	   }


}
