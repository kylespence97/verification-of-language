public class TriFunction implements NamedFunction<int[], Integer> {

    // This function has been transpiled from HAHA.
    private static int tri(int n)
    {
    	int i;
    	int ans;
    	int tri;
    	i = n;
    	/* i = n /\ n >= 0 */
    	ans = 0;
    	/* i = n /\ n >= 0 /\ ans = 0 */
    	while(i != 0)
    	{
    		ans = ans + i;
    		/* ( ( ( i - 1 ) * i ) / 2 ) + ans = ( n * ( n + 1 ) ) / 2 /\ i > 0 /\ n >= 0 */
    		i = i - 1;
    		/* ( ( i * ( i + 1 ) ) / 2 ) + ans = ( n * ( n + 1 ) ) / 2 /\ i >= 0 /\ n >= 0 */
    	}
    	/* ans = ( n * ( n + 1 ) ) / 2 /\ ( n * ( n + 1 ) ) / 2 = ( ( i * ( i + 1 ) ) / 2 ) + ans /\ i = 0 */
    	tri = ans;
    	return tri;
    }

    /**
     * @inheritDoc
     */
    public Integer apply(int[] args) {
        return tri(args[0]);
    }

    /**
     * @inheritDoc
     */
    public String getName() {
        return "tri";
    }

   /**
    * @inheritDoc
    */
    public int getArity() {
        return 1;
    }
}
