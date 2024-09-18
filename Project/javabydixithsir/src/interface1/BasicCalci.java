package interface1;

class BasicCalci implements InterfaceBasicCalci
{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int add(int... a) {
		int sum  = 0  ; 
		for ( int i = 0 ; i < a.length ; i++ ) {
			sum += a[i] ; 
		}
		return sum  ; 
	
	}

	@Override
	public int sub(int a, int b) {
		
		return a-b;
	}

}
