package interface1;
 class CalciVer2 extends BasicCalci implements InterfaceCalciVer2{

	

	@Override
	public double square(double a) {
		
		return a*a;
	}

	@Override
	public double cube(double b) {
		
		return b*b*b;
	}

}
