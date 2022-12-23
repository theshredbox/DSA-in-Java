package lesson3;
class SieveAlgorithm
{
	void sievealgorithm(int n)
	{
		boolean b[] = new boolean[n+1];
		for(int i=0;i<=n;i++)
			b[i] = true;
		
		for(int p = 2; p*p <=n; p++)
		{

			if(b[p] == true)
			{
				for(int i = p*p; i <= n; i= p+i)
					b[i] = false;
			}
		}
		

		for(int i = 2; i <= n; i++)
		{
			if(b[i] == true)
				System.out.print(i + " ");
		}
	}
	
	public static void main(String args[])
	{
		int n = 1000;
		System.out.print("Prime numbers: ");
		SieveAlgorithm g = new SieveAlgorithm();
		g.sievealgorithm(n);
	}
}
