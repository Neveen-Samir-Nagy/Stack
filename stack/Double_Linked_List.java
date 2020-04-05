package eg.edu.alexu.csd.datastructure.stack;

import eg.edu.alexu.csd.datastructure.stack.cs60.DNode;

/**.
 * javadoc
 * @author EL-hamd
 *
 */
public class Double_Linked_List {
	/**
	 * . node1
	 */
	private DNode head = new DNode(null, null, null);

	/**
	 * . node2
	 */
	private DNode tail = new DNode(null, null, head);

	/**
	 * . size
	 */
	private int size;

	/**
	 * . double
	 */
	public Double_Linked_List() {
		size = 0;
		head.setNext(tail);
	}

	/**
	 * . void
	 *
	 * @param element
	 *            first
	 */
	public void add(final Object element) {
		// TODO Auto-generated method stub
		DNode temp = new DNode(element, null, null);
		temp.setPrev(tail.getPrev());
		temp.setNext(tail);
		DNode curr = tail.getPrev();
		tail.setPrev(temp);
		curr.setNext(temp);
		size++;
	}

	/**
	 * . get
	 *
	 * @param index
	 *            first
	 * @return the object
	 */
	public Object get(final int index) {
		// TODO Auto-generated method stub
		if (index >= size || index < 0) {
			throw new UnsupportedOperationException("Error");
		}
		DNode curr = tail.getPrev();
		return curr.getElement();
	}

	/**
	 * . boolean
	 *
	 * @return boolean
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (head.getNext() == null || size == 0) {
			return true;
		}
		return false;
	}

	/**
	 * . void2
	 *
	 * @param index
	 *            first
	 */
	public void remove(final int index) {
		// TODO Auto-generated method stub
		if (index >= size || size == 0 || index < 0) {
			throw new UnsupportedOperationException("Error");
		}
		DNode curr1 = tail.getPrev();
		tail.setPrev(curr1.getPrev());
		(curr1.getPrev()).setNext(tail);
		curr1.setNext(null);
		curr1.setPrev(null);
		size--;

	}

	/**
	 * . int1
	 *
	 * @return integer
	 */
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
}
