import java.util.Scanner ;


public class SquareRoot {

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in) ;
		double n = in.nextDouble() ;
		System.out.println(squareRoot(n) );
		
		}
		
		
		public static double squareRoot(double x) {
			double sq = Math.sqrt(x) ;
			double i =x/2.0;
			while  ( Math.abs(x-sq) >= 0.0001){
				i = (i+x/i)/2 ;
				System.out.println(i) ;
		}
		return i ;
	}

}
