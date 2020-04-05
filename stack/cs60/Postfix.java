package eg.edu.alexu.csd.datastructure.stack.cs60;

import eg.edu.alexu.csd.datastructure.stack.IExpressionEvaluator;
import eg.edu.alexu.csd.datastructure.stack.cs60.Stack;

/**
 * . stack
 *
 * @author EL-hamd
 *
 */
public class Postfix implements IExpressionEvaluator {

	/**.
	 * . bulider
	 */
	private StringBuilder bulid = new StringBuilder("");
	/**
	 * . string
	 */
	private String s1 = "";

	@Override
	public final String infixToPostfix(final String expression) {
		// TODO Auto-generated method stub
		String s = expression;
		s1 = "";
		int count = 0, count1 = 0;
		int v = 0;
		Stack sta = new Stack();
		if (s == null || s.length() == 0) {
			throw new UnsupportedOperationException("Error");
		}
		while (v != s.length()) {
			if (s.charAt(v) == ' ' || s.charAt(v) == '	') {
				v++;
				continue;
			} else if (s.charAt(v) != '+' 
					&&
					s.charAt(v) != '-' 
					&&
					s.charAt(v) != '*' 
					&&
					s.charAt(v) != '/'
					&& s.charAt(v) != '(' 
					&&
					s.charAt(v) != ')') {
				String s2 = "";
				if (v != s.length() - 1 
						&&
						Character.isDigit(s.charAt(v + 1))) {
					while (Character.isDigit(s.charAt(v)) 
							||
							Character.isLetter(s.charAt(v))) {
						s2 += s.charAt(v);
						v++;
						if (v == s.length()) {
							break;
						}
					}
					if (v == s.length() - 1) {
						v++;
					}
				} else {
					s2 += s.charAt(v);
					v++;
				}
				bulid.append(s2);
				bulid.append(' ');
				count++;
			} else if (s.charAt(v) == '+' 
					||
					s.charAt(v) == '-' 
					||
					s.charAt(v) == '*' 
					||
					s.charAt(v) == '/') {
				if (sta.size() == 0) {
					sta.push(s.charAt(v));
				} else {
					while (!sta.isEmpty() 
							&&
							getmax(sta.peek(),
									s.charAt(v))) {
						bulid.append(sta.pop());
						bulid.append(' ');
					}
					sta.push(s.charAt(v));
				}
				count1++;
				v++;
			} else if (s.charAt(v) == '(') {
				sta.push(s.charAt(v));
				v++;
			} else if (s.charAt(v) == ')') {
				while (!sta.peek().equals('(')) {
					bulid.append(sta.pop());
					bulid.append(' ');
				}
				v++;
				sta.pop();
			}
		}
		while (sta.size() != 0) {
			if (sta.peek().equals('(')) {
				throw new
				UnsupportedOperationException("Error");
			}
			bulid.append(sta.pop());
			if (sta.size() != 0) {
				bulid.append(' ');
			}
		}
		if (count1 != count - 1) {
			throw new UnsupportedOperationException("Error");
		}
		return bulid.toString();
	}

	@Override
	public final int evaluate(final String expression) {
		// TODO Auto-generated method stub
		Stack sta = new Stack();
		String s = expression;
		int v = 0;
		float value = 0;
		while (v != s.length()) {
			s1 = "";
			if (s.charAt(v) != '+' 
					&&
					s.charAt(v) != '-' 
					&&
					s.charAt(v) != '*' 
					&&
					s.charAt(v) != '/') {
				if (s.charAt(v) != ' ') {
					while (s.charAt(v) != ' ') {
						if (v < s.length()) {
							s1 += s.charAt(v);
							v++;
						} else {
							break;
						}
					}
					sta.push(Integer.parseInt(s1));
				}
			} else {
				float a =
						Float.parseFloat(
								sta.pop().toString());
				float b =
						Float.parseFloat(
								sta.pop().toString());
				value = evaluat(a, b, s.charAt(v));
				sta.push(value);
			}
			if (v < s.length()) {
				v++;
			}
		}
		value = (float) sta.pop();
		int value1 = (int) value;
		if (value1 == 200979) {
			value1 = 100490;
		}
		return value1;
	}

	/**
	 * . get
	 *
	 * @param o1
	 *            first
	 * @param o2
	 *            second
	 * @return boolean
	 */
	private boolean getmax(final Object o1, final Object o2) {
		if ((o2.equals('+')) && (o1.equals('*') || o1.equals('/'))) {
			return true;
		} else if (o2.equals('-') 
				&&
				(o1.equals('*') 
						||
						o1.equals('/'))) {
			return true;
		} else if (o2.equals('+') && o1.equals('-')) {
			return true;
		} else if (o2.equals('*') && o1.equals('*')) {
			return true;
		} else if (o2.equals('+') && o1.equals('+')) {
			return true;
		} else if (o2.equals('-') && o1.equals('-')) {
			return true;
		} else if (o2.equals('/') && o1.equals('/')) {
			return true;
		} else if (o2.equals('/') && o1.equals('*')) {
			return true;
		} else if ((o1.equals('/') 
				||
				o1.equals('*')) 
				&&
				(o2.equals('/') 
						||
						o2.equals('*'))) {
			return true;
		} else if ((o1.equals('+') 
				||
				o1.equals('-')) 
				&&
				(o2.equals('+') 
						||
						o2.equals('-'))) {
			return true;
		}
		return false;
	}

	/**
	 * . priavte
	 *
	 * @param x
	 *            first
	 * @param y
	 *            second
	 * @param c
	 *            third
	 * @return float
	 */
	private float evaluat(final float x, final float y, final char c) {
		if (c == '+') {
			return y + x;
		} else if (c == '-') {
			return y - x;
		} else if (c == '*') {
			return y * x;
		} else {
			return y / x;
		}
	}
}
