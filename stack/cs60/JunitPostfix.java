package eg.edu.alexu.csd.datastructure.stack.cs60;

import org.junit.Assert;
import org.junit.Test;

/**.
 * junit
 * @author EL-hamd
 *
 */
public class JunitPostfix {

	/**.
	 * s1
	 */
	private Postfix s1  = new Postfix();

	/**.
	 * test1
	 */
	@Test
	public void testevaluate() {
		String str = "1 + 2 * 3 - 4";
		int v = s1.evaluate(str);
		int d  = 3;
		Assert.assertEquals(d, v);
	}

	/**.
	 * test2
	 */
	@Test
	public void testInfixToPostfix() {
		String s = "a+e*b/(d-r)";
		String get = s1.infixToPostfix(s);
		String g = "a e * b / d - r +";
		Assert.assertEquals(g, get);
	}

	/**.
	 * test3
	 */
	@Test
	public void testinfixEvaluate() {
		String s = "1+2*(3-2)+3";
		String ss = s1.infixToPostfix(s);
		int k = s1.evaluate(ss);
		int d = 6;
		Assert.assertEquals(d, k);
	}

}
