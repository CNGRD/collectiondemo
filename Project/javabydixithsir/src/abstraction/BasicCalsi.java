package abstraction;

 class BasicCalsi extends AbstractBasicCalsi {

	@Override
	int add(int a, int b) {
		
		return a+b;
	}

	@Override
	int add(int... a){
		
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
