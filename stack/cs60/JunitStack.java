package eg.edu.alexu.csd.datastructure.stack.cs60;

import org.junit.Assert;
import org.junit.Test;

/**.
 * junit
 * @author EL-hamd
 *
 */
public class JunitStack {

	/**.
	 * s
	 */
    private Stack s = new Stack();

    /**.
     * test1
     */
	@Test
	public void teststack() {
		s.push(2);
		s.push('b');
		s.push(4);
		s.push("Data");
		Object b = s.peek();
		Assert.assertEquals("Data", b);
	}

	/**.
	 * test2
	 */
	@Test
	public void testsize() {
		s.push(5);
		s.pop();
		int size = s.size();
		int v = 4;
		Assert.assertEquals(v, size);
	}

	/**.
	 * test3
	 */
	@Test
	public void testpop() {
        s.push(7);
        Object c = s.pop();
        Assert.assertEquals(7, c);
	}

	/**.
	 * test4
	 */
	@Test
	public void testisempty() {
		boolean T = false;
		Assert.assertEquals(T, s.isEmpty());
	}
}
