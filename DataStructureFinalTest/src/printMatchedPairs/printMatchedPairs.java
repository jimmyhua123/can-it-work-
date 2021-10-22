package printMatchedPairs;

import java.util.Stack;

public class printMatchedPairs {

	public static void main(String[] args) {
		System.out.println("sample 1:");
		String str = "(a*(b+c)+d))";
		printMatchedPair(str);
		System.out.println("--------------------------------------");
		System.out.println("sample 2:");
		String str1 = "a*(b+c)+d)))";
		printMatchedPair(str1);
		System.out.println("-------------------------------------");
		System.out.println("sample 3:");
		String str2 = "((a*((b+c)+d))";
		printMatchedPair(str2);

	}

	public static void printMatchedPair(String str) {
		Stack<Integer> s = new Stack<Integer>();
		 for( int i = 0; i < str.length( ); i++ )
	         if( str.charAt( i ) == '(' )
	            s.push( i );
	         else if( str.charAt( i ) == ')' )
	            try
	            {  // remove location of matching '( ' from stack
	               System.out.println( s.pop( ) + "  " + i );
	            }
	            catch ( Exception e )
	            {  // stack was empty, no match exists
	               System.out.println( "No match for right parenthesis at " + i );
	            }

	      // remaining '( ' in stack are unmatched
	      while( !s.isEmpty( ) )
	         System.out.println( "No match for left parenthesis at " + s.pop( ) );
	}

}