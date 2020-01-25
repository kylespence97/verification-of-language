public class ModuloFunction implements NamedFunction<int[], Integer> {

    // This function has been transpiled from HAHA.
    private static int modulo(int x, int y)
    {
    	int r;
    	int q;
    	int modulo;
    	r = x;
    	/* r = x /\ x >= 0 /\ y > 0 */
    	q = 0;
    	/* r = x /\ x >= 0 /\ y > 0 /\ q = 0 */
    	while(r >= y)
    	{
    		q = q + 1;
    		/* ( r - y ) = x - ( q * y ) /\ x >= 0 /\ y > 0 */
    		r = r - y;
    		/* r = x - ( q * y ) /\ x >= 0 /\ y > 0 */
    	}
    	/* r = x - ( q * y ) /\ x >= 0 /\ y > 0 */
    	modulo = r;
    	/* modulo = x - ( q * y ) */
    	return modulo;
    }

    /**
     * @inheritDoc
     */
    public Integer apply(int[] args) {
        return modulo(args[0], args[1]);
    }

    /**
     * @inheritDoc
     */
    public String getName() {
        return "modulo";
    }

   /**
    * @inheritDoc
    */
    public int getArity() {
        return 2;
    }
}
