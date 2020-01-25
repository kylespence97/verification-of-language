public class QuotFunction implements NamedFunction<int[], Integer> {

    // This function has been transpiled from HAHA.
    private static int quot(int x, int y)
    {
    	int r;
    	int q;
    	int quot;
    	r = x;
    	/* r = x /\ x >= 0 /\ y > 0 */
    	q = 0;
    	/* q = 0 /\ r = x /\ x >= 0 /\ y > 0 */
    	while(r >= y)
    	{
    		q = q + 1;
    		/* x = ( q * y ) + ( r - y ) /\ r >= y /\ x >= 0 /\ y > 0 */
    		r = r - y;
    		/* x = ( q * y ) + r /\ x >= 0 /\ y > 0 */
    	}
    	/* x = ( q * y ) + r /\ r < y /\ x >= 0 /\ y > 0 */
    	quot = q;
    	/* x = ( quot * y ) + r */
    	return quot;
    }

    /**
     * @inheritDoc
     */
    public Integer apply(int[] args) {
        return quot(args[0], args[1]);
    }

    /**
     * @inheritDoc
     */
    public String getName() {
        return "quot";
    }

   /**
    * @inheritDoc
    */
    public int getArity() {
        return 2;
    }
}
