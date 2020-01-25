public class EqualFunction implements NamedFunction<int[], Integer> {

    // This function has been transpiled from HAHA.
    private static int equal(int x, int y)
    {
    	int left;
    	int right;
    	int sum;
    	int result;
    	int equal;
    	left = x;
    	/* left = x /\ x >= 0 /\ y >= 0 */
    	right = y;
    	/* right = y /\ left = x /\ x >= 0 /\ y >= 0 */
    	result = 0;
    	/* result = 0 /\ right = y /\ left = x /\ x >= 0 /\ y >= 0 */
    	sum = left - right;
    	/* sum = left - right /\ result = 0 /\ right = y /\ left = x /\ x >= 0 /\ y >= 0 */
    	if(( sum == 0 ))
    	{
    		{
    			result = 1;
    			/* isEqual ( left , right ) /\ result = 1 */
    		}
    	}
    	/* ( result = 0 \/ result = 1 ) */
    	equal = result;
    	/* equal = result /\ ( result = 0 \/ result = 1 ) */
    	return equal;
    }

    /**
     * @inheritDoc
     */
    public Integer apply(int[] args) {
        return equal(args[0], args[1]);
    }

    /**
     * @inheritDoc
     */
    public String getName() {
        return "equal";
    }

   /**
    * @inheritDoc
    */
    public int getArity() {
        return 2;
    }
}
