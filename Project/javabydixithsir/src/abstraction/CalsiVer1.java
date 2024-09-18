package abstraction;

public class CalsiVer1 extends AbstractCalsiVer1{

	@Override
	double power(double m, double n) {
		int a=1;
		while(n!=0)
		{
			a*=m;
			--n;
		}
		return a;
	}

	@Override
	int add(int a, int b) {
		
		return a+b;
	}

	@Override
	int add(int... a) {
		int sum  = 0  ; 
		for ( int i = 0 ; i < a.length ; i++ ) {
			sum += a[i] ; 
		}
		return sum  ; 
	}

	@Override
	int sub(int a, int b) {
		
		return a-b;
	}

}
