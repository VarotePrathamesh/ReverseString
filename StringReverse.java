import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String string = sc.next();
		System.out.println(revByStringBuffer(string));
		System.out.println(revByStringBuilder(string));
		System.out.println(revByArray(string));
		System.out.println(revByCharAt(string));
		System.out.println(revByRecursion(string));

	}

	// By ReverseByStringBuffer
	static String revByStringBuffer(String str) {

		StringBuffer sb = new StringBuffer(str);
		String Result = sb.reverse().toString();
		return Result;

	}

	// By ReverseByStringBuilder
	static String revByStringBuilder(String str) {

		StringBuilder Sb = new StringBuilder(str);
		String Result = Sb.reverse().toString();
		return Result;

	}

	// By ReverseByArray
	static String revByArray(String str) {

		String Rev = "";
		char[] Result = str.toCharArray();
		for (int i = Result.length-1; i >= 0; --i) {
			Rev += Result[i];

		}
		return Rev;

	}

	// By ReverseByCharAt
	static String revByCharAt(String str) {

		String Rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			Rev += str.charAt(i);
		}
		return Rev;

	}

	// By ReverseByRecursion
	static String revByRecursion(String str) {

		if (str.length() < 2) {
			return str;
		}
		return revByRecursion(str.substring(1)) + str.charAt(0);
	}

}
