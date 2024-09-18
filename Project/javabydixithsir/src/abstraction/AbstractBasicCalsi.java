package abstraction;

abstract class AbstractBasicCalsi 
{
	abstract int add(int a,int b);
	abstract int add(int ...a);
	abstract int sub(int a,int b);

}
abstract class AbstractCalsiVer1 extends AbstractBasicCalsi
{
	abstract double power(double m,double n);
}
abstract class AbstractCalsiVer2 extends AbstractBasicCalsi
{
	abstract double square(double p);
	abstract double cube(double q);
}