package Variables;//package - keyword, Variables - Identifier
//(single line comment) - comments
//  /* multi-line comments
//     ...................
//  */
// ; - end of line
public class example1 {//example1 - class name
	// {
	    //class scope/class body
	// }
	
	public static void main(String[] args) {//method scope/method body
		//main - method name, without main program will not get executed
		System.out.println("good night");
		
		//1. Variable Declaration
		//String - words, sentences and paragraph - " "
		String msg;//data_type variable_name;
		
		//2. Variable Initialization
		msg = "good night";
		
		//3. Usage
		System.out.println(msg);
	}

}
