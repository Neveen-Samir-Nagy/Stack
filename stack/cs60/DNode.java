package eg.edu.alexu.csd.datastructure.stack.cs60;

/**
 * . Public
 *
 * @author EL-hamd
 *
 */
public class DNode {
	/**.
	 * . Dnode
	 */
	private Object element;
	/**
	 * . DNoe
	 */
	private DNode next, prev;

	/**
	 * . DNode
	 *
	 * @param newElement
	 *            first
	 * @param newNext
	 *            second
	 * @param newPrev
	 *            third
	 */
	public DNode(final Object newElement,
			final DNode newNext, final DNode newPrev) {
		this.element = newElement;
		this.next = newNext;
		this.prev = newPrev;
	}

	/**
	 * . get
	 *
	 * @return Object
	 */
	public Object getElement() {
		return element;
	}

	/**
	 * . get
	 *
	 * @return DNode
	 */
	public DNode getPrev() {
		return prev;
	}

	/**
	 * . Dnode
	 *
	 * @return DNode
	 */
	public DNode getNext() {
		return next;
	}

	/**
	 * . void
	 *
	 * @param newElement
	 *            first
	 */
	public void setElement(final Object newElement) {
		element = newElement;
	}

	/**
	 * . Void
	 *
	 * @param newPrev
	 *            first
	 */
	public void setPrev(final DNode newPrev) {
		prev = newPrev;
	}

	/**
	 * . Void
	 *
	 * @param newNext
	 *            first
	 */
	public void setNext(final DNode newNext) {
		next = newNext;
	}
}
