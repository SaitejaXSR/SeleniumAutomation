package StringPrograms;

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Welcome");
		
		System.out.println(sb);
		
		sb.append(" to Java");
		
		System.out.println(sb);
		
		sb.insert(0, "Hi! ");
		
		System.out.println(sb);
		
	}

}
