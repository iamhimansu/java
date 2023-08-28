package examples;

/**
 * InitializationBlock is an unnamed block of code  which is run just before the object initializes
 * the content inside of block is copied to the top of the constructor
 */
public class InitializationBlock {
    private static int k;
    private static int count;

    static { //This will be invoked once for this class, remove static keyword  to see the difference
        count++;
        k += 10;
        System.out.println("Static Initialization of k, value of k=" + k);
    }

    InitializationBlock() {
        System.out.println("Object Created, value of k is: " + k);
        System.out.println("Object Count is " + count);
    }

    public static void main(String[] args) {
        InitializationBlock i = new InitializationBlock();
        InitializationBlock j = new InitializationBlock();
        new InitializationBlock();
        new InitializationBlock();
    }
}
