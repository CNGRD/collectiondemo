package abstraction;

public class ClasiVer2 extends AbstractCalsiVer2{

	@Override
	double square(double p) {
		
		return p*p;
	}

	@Override
	double cube(double q) {
		
		return q*q*q;
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
