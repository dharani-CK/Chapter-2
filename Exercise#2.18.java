/*This program uses a "printf" and "for" statements to print a table:  a b pow(a, b)
                                                                       1 2 1
                                                                       2 3 8
                                                                       3 4 81
                                                                       4 5 1024
                                                                       5 6 15625  
*/


public class PrintATable
{
	public static void main(String[] args) {
    
    //initializing the variables
		int a = 0;
		int b = 0;
		
		System.out.printf("%s %s %s\n", "a", "b", "pow(a,b)");
		
    //using "for" statement to get the output
		for(int i = 0; i < 5; i++){
		    a = a + 1;
		    b = a + 1;
		    int pow = (int)(Math.pow(a, b));
		    System.out.printf("%d %d %d\n", a, b, pow);
		    
		}
    
	}
}
