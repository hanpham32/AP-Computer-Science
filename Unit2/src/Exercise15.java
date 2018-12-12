
public class Exercise15 {
	public static void main(String[] args) {
		intDouble(3);
		doubleInt(12.2);
		charInt('a');
		numChar(97);
		longShort(123);
		shortLong((short) 65);
		// Have to cast the num to short to able to work
		floatInt((float) 3.2);
		// Have to cast num to float
		floatDouble((float) 3.4);
		// Returned a long series of numbers
		intFloat(2);
		doubleFloat(12);
	}
	
	public static void intDouble(int x) {
		double d = (double)x;
		System.out.println(d);    
	}
	public static void doubleInt(double x) {
		int i = (int)x;
		System.out.println(i);
	}
	public static void charInt(char c) {
		int ascii = (int)c;
		System.out.println(ascii);
	}
	public static void numChar(int x) {
		char c = (char)x;
		System.out.println(c);
	}
	public static void longShort(long x) {
		short s = (short)x;
		System.out.println(s);
	}
	public static void shortLong(short x) {
		long l = (long)x;
		System.out.println(l);
	}
	public static void floatInt(float x) {
		int i = (int)x;
		System.out.println(i);
	}
	public static void floatDouble(float x) {
		double d = (double)x;
		System.out.println(d);
	}
	public static void intFloat(int x) {
		float f = (float)x;
		System.out.println(f);
	}
	public static void doubleFloat(double x) {
		float f = (float)x;
		System.out.println(f);
	}
}

