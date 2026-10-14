import java.util.Scanner ;

public class SquareRoot {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in) ;
		System.out.println("Input number that you want the square root of") ;
		
		for(;;) {
		double n = in.nextDouble() ;
		System.out.println("Evaluation: ") ;
		System.out.println(squareRoot(n) );
		System.out.println() ;
		System.out.println("Input number that you want the square root of") ;
			}
		}
		
		
		public static double squareRoot(double x) {
			double sq = Math.sqrt(x) ;
			double i =x/2.0;
			while  ( Math.abs(i-sq) >= 0.0001){
				i = (i+x/i)/2 ;
			}
		return i ;
		}

}
