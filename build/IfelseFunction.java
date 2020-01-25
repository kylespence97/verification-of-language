public class IfelseFunction implements NamedFunction<int[], Integer> {

    // This function has been transpiled from HAHA.
    private static int ifelse(int p, int x, int y)
    {
    	int result;
    	int ifelse;
    	result = y;
    	/* ( p = 0 \/ p = 1 ) /\ result = y */
    	if(p == 1)
    	{
    		{
    			/* p = 1 /\ result = y */
    			result = x;
    			/* p = 1 /\ result = x */
    		}
    	}
    	/* ( p = 0 /\ result = y ) \/ ( p = 1 /\ result = x ) */
    	ifelse = result;
    	/* ( p = 0 /\ ifelse = y ) \/ ( p = 1 /\ ifelse = x ) */
    	return ifelse;
    }

    /**
     * @inheritDoc
     */
    public Integer apply(int[] args) {
        return ifelse(args[0], args[1], args[2]);
    }

    /**
     * @inheritDoc
     */
    public String getName() {
        return "ifelse";
    }

   /**
    * @inheritDoc
    */
    public int getArity() {
        return 3;
    }
}
