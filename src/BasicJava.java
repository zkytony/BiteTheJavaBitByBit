/*
 * The class that contains all of the most basic features in Java
 * 
 */
public class BasicJava {

	/*
	 * This functions explores the basic features
	 * about Java variables
	 * 
	 * Note:
	 * Default values of variables (applied not for local variables
	 * but for fields):
	 * Data Type	Default Value (for fields)
		byte		0
		short		0
		int			0
		long		0L
		float		0.0f
		double		0.0d
		char		'\u0000'
		String 		(or any object)  	null
		boolean		false
		
		========
	 * For local variables, the compiler never! assigns a default
	 * value to an uninitialized local variable
	 */
	public static void local_variables() {
		// Local variable: variable that is stored in a
		// temporary state; it is only accessible to the
		// function after it is declared, and it is not
		// visible to the rest of the class
		// 
		// int data type is a 32-bit signed two's complement 
		// integer, which has a minimum value of -2^31 and a
		// maximum value of 2^31-1
		int local_int = 6;
		int local_int_char = 'a'; // also able to assign char
		
		// 16 bit signed two's complement integer
		short local_short = 2;
		
		// byte is 8-bit signed two's complement"integer
		// range from -128 - 127
		byte local_byte = 'a';
		byte local_byte_int = 44;
		
		// 64 bit signed two's complement"integer
		long local_long = 999999999;
		
		// Basically, byte, short, long, int are all integers
		
		System.out.println("Local int          : " + local_int);
		System.out.println("Local int char (a) : " + local_int_char);
		System.out.println("Local short        : " + local_short);
		System.out.println("Local byte 'a'     : " + local_byte);
		System.out.println("Local byte int     : " + local_byte_int);
		System.out.println("Local long         : " + local_long);
		System.out.println();
		
		// floats and doubles
		
		// In Java The float data type is a single-precision 
		// 32-bit IEEE 754 floating point.
		// In Java, to declare a float, you have to put f after
		// the number
		float local_float = 0.5f;
		
		// double in Java is 64 bit IEEE 754 floating point
		double local_double = 3.1415;
		
		// In order to perform this basic addition, you have to
		// explicitly cast double to float
		float sum1 = local_float + (float)local_double;
		
		System.out.println("Local float  : " + local_float);
		System.out.println("Local double : " + local_double);
		System.out.println("Local sum1   : " + sum1);
		System.out.println();
		
		// Boolean
		// You must give a boolean an initial value
		boolean local_boolean = false;
		
		System.out.println("Local boolean : " + local_boolean);
		
		// char
		// In Java, a char is a single 16-bit Unicode character.
		// Minimum value: \u0000
		// Maximum value: \uffff
		char local_char = 'g';
		char local_char_code1 = '\u5453'; // it is a chinese character
		char local_char_code2 = '\uabc4'; //
		
		System.out.println("Local char         : " + local_char);
		System.out.println("Local char \\u5453  : " + local_char_code1);
		System.out.println("Local char \\u5453  : " + local_char_code2);
		
	}
	
	// The main
	public static void main(String[] args) {
		local_variables();
	}
}
