
public class DelimiterChecker {
	StackX stack = new StackX(100);
	static String s = "a";
	
	public boolean check(String s) {
		if(s.length() > 100) {
			System.out.println("error String argument exceeded 100 character maximum limit");
			return false;
		}
		if(s.isEmpty()) {
			System.out.println("String was empty");
			return true;
		}
		for(int i = 0; i < s.length();i++) {
			if(s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			}
			else if(s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			}
			else if(s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			}
			else if(s.charAt(i) == ')') {
				if(stack.peek() == '(') {
					stack.pop();
				}
			}
			else if(s.charAt(i) == ']') {
				if(stack.peek() == '[') {
					stack.pop();
				}
			}
			else if(s.charAt(i) == '}') {
				if(stack.peek() == '{') {
					stack.pop();
				}
			}
		}
		if(stack.isEmpty()) {
			System.out.println("String has the proper delimiters");
			return true;
			}
		else {
			System.out.println("String has improperly placed delimiters please correct and try again");
			return false;
		}
	}//end of check
	
	
	public static void main(String... args) {
		DelimiterChecker dCheck = new DelimiterChecker();
		dCheck.check(s);
	}
}
