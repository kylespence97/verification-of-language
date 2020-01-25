public class MultFunction implements NamedFunction<int[], Integer> {

    // This function has been transpiled from HAHA.
    private static int mult(int x, int y)
    {
    	int i;
    	int ans;
    	int mult;
    	i = y;
    	/* i = y /\ y >= 0 */
    	ans = 0;
    	/* i = y /\ y >= 0 /\ ans = 0 */
    	while(i != 0)
    	{
    		ans = ans + x;
    		/* ( ( i - 1 ) * x ) + ( ans ) = x * y /\ i > 0 /\ y >= 0 */
    		i = i - 1;
    		/* ( i * x ) + ans = x * y /\ i >= 0 /\ y >= 0 */
    	}
    	/* ans = x * y /\ x * y = ( i * x ) + ans /\ i = 0 */
    	mult = ans;
    	return mult;
    }

    /**
     * @inheritDoc
     */
    public Integer apply(int[] args) {
        return mult(args[0], args[1]);
    }

    /**
     * @inheritDoc
     */
    public String getName() {
        return "mult";
    }

   /**
    * @inheritDoc
    */
    public int getArity() {
        return 2;
    }
}
