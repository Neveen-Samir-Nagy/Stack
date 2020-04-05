package eg.edu.alexu.csd.datastructure.stack.cs60;

import java.util.Scanner;

/**.
 * main
 * @author EL-hamd
 *
 */
public class Mainstack {

	/**.
	 * stack
	 */
	private static Stack s = new Stack();

	/**.
	 * main1
	 * @param args
	 *      first
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		System.out.println
		("Please enter the number"
				+ " of the operation that you want.");
		System.out.println("1- Push in stack");
		System.out.println("2- pop from stack");
		System.out.println("3- Get the last element in stack");
		System.out.println("4- Get the size of the stack");
		System.out.println("5- Know if the stack is empty stack!");
		System.out.println("6- Exit");
		Scanner i = new Scanner(System.in);
		int scan = i.nextInt();
		while (scan != 6) {
			switch (scan) {
			case (1):
				System.out.println
				("Please enter the"
						+ " element to be pushed");
				Object c = i.nextLine();
				s.push(c);
				break;
			case (2):
				if (s.isEmpty()) {
					System.out.println
					("The stack is"
							+ " empty!");
				} else {
					System.out.println
					("The last"
							+ " element is poped : " +
							s.peek());
					s.pop();
				}
				break;
			case (3):
				if (s.isEmpty()) {
					System.out.println
					("The stack"
							+ " is empty!");
				} else {
					System.out.println
					("The last element"
							+ " is : " + s.peek());
				}
				break;
			case (4):
				System.out.println("The size is : " + s.size());
				break;
			case (5):
				System.out.println(s.isEmpty());
				break;
			default:
				System.out.println
				("This Number is not valid"
						+ " please enter the right"
						+ " number.");
			}
			scan = i.nextInt();
		}
		System.out.println("Thanks for visit our Application :)");
	}

}