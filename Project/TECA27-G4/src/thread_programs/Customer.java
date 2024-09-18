package thread_programs;

class Customer
{    
	int amount=10000;    
    
	synchronized void withdraw(int amount)
	{    
		System.out.println("withdraw money");    
    
		if(this.amount<amount)
		{    
			System.out.println("Insufficient balance ,Deposit some money ");    
			try
			{
				wait();
			}
			catch(Exception e)
			{
				System.out.println("First Deposit money");
			}    
		}    
		this.amount-=amount;    
		System.out.println("money withdrawn");    
}    
    
	synchronized void deposit(int amount)
	{    
		System.out.println("Deposit money");    
		this.amount+=amount;    
		System.out.println("Money Deposited ");    
		notify();    
	}    
}    