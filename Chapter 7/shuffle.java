public class shuffle
{
	public static void main(String[] args)
	{
		int[] cards = new int[53];
		for(int i=0; i<51; i++)
			{
				cards[i]=i+1;
				System.out.printf("%s, ", cards[i]);
			}
		cards[52]=52;	 
		System.out.printf("%s",cards[52]);
	}
}

