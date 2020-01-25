public class SquaredFunction implements NamedFunction<int[], Integer> {

    // This function has been transpiled from HAHA.
    private static int squared(int n)
    {
    	int count;
    	int ans;
    	int value;
    	int squared;
    	value = n;
    	/* n > 0 /\ value = n /\ value > 0 */
    	count = n;
    	/* n > 0 /\ value = n /\ count = n /\ count > 0 /\ value > 0 */
    	ans = 0;
    	/* ans = 0 /\ n > 0 /\ value = n /\ count = n /\ count > 0 /\ value > 0 */
    	while(( count > 0 ))
    	{
    		ans = ans + value;
    		/* ( value * ( count - 1 ) ) + ans = n * n /\ n > 0 /\ value > 0 /\ count > 0 */
    		count = count - 1;
    		/* ( value * count ) + ans = n * n /\ n > 0 /\ value > 0 /\ count >= 0 */
    	}
    	/* ( value * count ) + ans = n * n /\ ans > 0 /\ count = 0 /\ n > 0 /\ value > 0 */
    	squared = ans;
    	/* squared = n * n /\ n > 0 /\ ( value * count ) + ans = n * n /\ ans > 0 /\ count = 0 /\ n > 0 */
    	return squared;
    }

    /**
     * @inheritDoc
     */
    public Integer apply(int[] args) {
        return squared(args[0]);
    }

    /**
     * @inheritDoc
     */
    public String getName() {
        return "squared";
    }

   /**
    * @inheritDoc
    */
    public int getArity() {
        return 1;
    }
}
