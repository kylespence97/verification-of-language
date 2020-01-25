public class FactorialFunction implements NamedFunction<int[], Integer> {

    // This function has been transpiled from HAHA.
    private static int factorial(int n)
    {
    	int i;
    	int ans;
    	int factorial;
    	i = n;
    	/* i = n /\ n >= 0 */
    	ans = 1;
    	/* i = n /\ n >= 0 /\ ans = 1 */
    	while(i != 1)
    	{
    		ans = ans * i;
    		i = i - 1;
    	}
    	factorial = ans;
    	return factorial;
    }

    /**
     * @inheritDoc
     */
    public Integer apply(int[] args) {
        return factorial(args[0]);
    }

    /**
     * @inheritDoc
     */
    public String getName() {
        return "factorial";
    }

   /**
    * @inheritDoc
    */
    public int getArity() {
        return 1;
    }
}
