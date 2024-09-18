package interface1;

 class CalciVer1 extends BasicCalci implements InterfaceCalciVer1{

	
	@Override
	public double power(int m, int n) {
		int a=1;
		while(n!=0)
		{
			a*=m;
			--n;
		}
		return a;
	}

}
