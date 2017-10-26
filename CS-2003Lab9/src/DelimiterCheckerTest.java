import static org.junit.Assert.*;

import org.junit.Test;

public class DelimiterCheckerTest {
	DelimiterChecker dcheck = new DelimiterChecker();
	String a = "";//good string
	String s = "([{}])";//good string 
	String f = "([{]])";//bad string
	String g = ")}][{(";//bad string
	String h = ")abcdefg(";//bad string
	//bad string ---> exceeds char limit
	String j = "[ssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss]";
	@Test
	public void test() {
		assertTrue(dcheck.check(a));
		assertTrue(dcheck.check(s));
		assertFalse(dcheck.check(f));
		assertFalse(dcheck.check(g));
		assertFalse(dcheck.check(h));
		assertFalse(dcheck.check(j));
	}

}
