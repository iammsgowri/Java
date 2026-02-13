package javastring;

public class StringClassMethods {

	public static void main(String[] args) {

		String myFullName = new String("Gowri Sekar");
		System.out.println(myFullName); // Gowri Sekar

		// public char charAt(int index);

		System.out.println(myFullName.charAt(0)); // G
		System.out.println(myFullName.charAt(1)); // o
		System.out.println(myFullName.charAt(4)); // i
		System.out.println(myFullName.charAt(5)); //

		// public boolean contains(CharSequence s);

		System.out.println(myFullName.contains(myFullName)); // true
		System.out.println(myFullName.contains(" ")); // true
		System.out.println(myFullName.contains("Gowri")); // true
		System.out.println(myFullName.contains("Sekar")); // true
		System.out.println(myFullName.contains("Se")); // true
		System.out.println(myFullName.contains("ar")); // true
		System.out.println(myFullName.contains("i")); // true

		System.out.println(myFullName.contains("IA")); // false
		System.out.println(myFullName.contains("Di")); // false
		System.out.println(myFullName.contains("I")); // false
		System.out.println(myFullName.contains("#")); // false
		System.out.println(myFullName.contains("$")); // false
		System.out.println(myFullName.contains("1")); // false

	}

}
