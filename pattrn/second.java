class second {

	public static void main(String[] args) {
		int i,j=0,n=3;
		for(i=1;i<=n;)
		{
			if(j<i)
			{	System.out.print("*");
				j++;
			}
			else if(j==i)
			{	System.out.println("");
				i++;j=0;
			}
		}

	}

}
