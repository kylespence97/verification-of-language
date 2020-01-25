package softwarereliability;

/**
 *
 * @author s6022157
 */
public class SoftwareReliability {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {      
        // modify with either testCase1(), testCase2() or testCase3() accordingly
        System.out.println(testCase3());
    }
    
    // makes use of java equivalent operators to ifelse, mult, equals, quot and
    // modulo
    //
    // should return 3
    public static int testCase1() {
        if (1 * 2 == 3) {
            return 0;
        } else {
            return (30 / 2) % 6;           
        }
    }
    
    // makes use of the java equivalent operator to add and java equivalent 
    // functions to factorial, squared and tri
    //
    // should return 160
    public static int testCase2() {
        return factorial(5) + squared(5) + tri(5);
    }
    
    // makes use of java equivalent operators to ifelse, equals and modulo as
    // well as java equivalent functions to factorial and squared 
    //
    // should return 1
    public static int testCase3() {
        if (factorial(squared(2)) == 24) {
            return (quot(5, 2));
        } else {
            return 0;
        }
    }

    // no built-in java operator for factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial (n - 1);
        }
    }
    
    // no built-in java operator for squared
    public static int squared(int n) {
        return n * n;
    }
    
    // no built-in java operator for tri
    public static int tri(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + tri (n - 1);
        }
    }
    
    //
    // SOLO FUNCTIONS
    //
    public static int mult(int x, int y) {
        return x * y;
    }
    
    public static int quot(int x, int y) {
        return x / y;
    }
    
    public static int modulo(int x, int y) {
        return x % y;
    }
    
    public static int add(int x, int y) {
        return x + y;
    }
    
    public static int ifelse() {
        if(true) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public static int equals(int x, int y) {
        int sum = x - y;
        if (sum == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
