package ArrayPrograms;

public class DuplicateValue {
	public static void main(String[] args) {
		String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
		System.out.println("the duplicate values in the array");
		for(int i = 0; i<strArray.length; i++) {
			for(int j = i+1 ; j<strArray.length; j++) {
				if(strArray[i].equalsIgnoreCase(strArray[j])) {
					System.out.println(strArray[i]);
				}
			}
		}
	}

}
