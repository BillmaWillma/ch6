import java.util.Scanner ;

public class Exercise6{
	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in) ;
		System.out.println("Input x and n, in this order, to evaluate the expression \"exp(-x^2)\" ") ;
		for (;;){
			int x=in.nextInt() ;
			int n=in.nextInt() ;
			if(n<=0){
				System.out.println("Please try again and input a positive integer value that is larger than 0 for n (n is the number of terms you wish to use to evaluate).") ;
			} else {
				System.out.println("Evaluation: " +gauss(x, n)) ;
				System.out.println() ;
				System.out.println("Input x and n in this order to exvaluate the expression \"exp(-x^2)\" ") ;
			}
		}
	}
	
	public static double gauss(int x, int n){
		double a=0 ;
		double t=1 ;
		int i=0 ;
		while (i<n ){
			if (i>0){
				t = t*(-x*x)/i;
			}
			a+=t ;
			i++ ;
		}
		return a ;
	}
}
