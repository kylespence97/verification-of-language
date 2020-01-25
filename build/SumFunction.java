public class SumFunction implements NamedFunction<int[], Integer> {

    // This function has been transpiled from HAHA.
    private static int sum(int x, int y)
    {
    	int ans;
    	int n;
    	int sum;
    	ans = x;
    	/* y >= 0 /\ ans = x */
    	n = y;
    	/* y >= 0 /\ n >= 0 /\ ans = x /\ n = y */
    	while(n != 0)
    	{
    		ans = ans + 1;
    		/* y >= 0 /\ n > 0 /\ ans + n - 1 = x + y */
    		n = n - 1;
    		/* y >= 0 /\ n >= 0 /\ ans + n = x + y */
    	}
    	/* n = 0 /\ ans + n = x + y */
    	sum = ans;
    	return sum;
    }

    /**
     * @inheritDoc
     */
    public Integer apply(int[] args) {
        return sum(args[0], args[1]);
    }

    /**
     * @inheritDoc
     */
    public String getName() {
        return "sum";
    }

   /**
    * @inheritDoc
    */
    public int getArity() {
        return 2;
    }
}
