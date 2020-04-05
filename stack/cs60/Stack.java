package eg.edu.alexu.csd.datastructure.stack.cs60;

import eg.edu.alexu.csd.datastructure.stack.Double_Linked_List;
import eg.edu.alexu.csd.datastructure.stack.IStack;

/**
 * . Stack
 *
 * @author EL-hamd1
 *
 */
public class Stack implements IStack {

	/**.
	 * . stack
	 */
	private Double_Linked_List stack = new Double_Linked_List();

	@Override
	public final Object pop() {
		// TODO Auto-generated method stub
		if (stack.size() == 0) {
			throw new UnsupportedOperationException("Empty");
		}
		Object c = stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		return c;
	}

	@Override
	public final Object peek() {
		// TODO Auto-generated method stub
		if (stack.size() == 0) {
			throw new UnsupportedOperationException("Empty");
		}
		return stack.get(stack.size() - 1);
	}

	@Override
	public final void push(final Object element) {
		// TODO Auto-generated method stub
		stack.add(element);
	}

	@Override
	public final boolean isEmpty() {
		// TODO Auto-generated method stub
		return (stack.isEmpty());
	}

	@Override
	public final int size() {
		// TODO Auto-generated method stub
		return (stack.size());
	}
}
