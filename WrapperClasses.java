/**
 * For every datatype there is a Wrapper class starting with the data type name itself
 * Example:
 * 1) int       -> Integer
 * 2) char      -> Character
 * 3) float     -> Float
 * 4) boolean   -> Boolean
 * ...
 * There are various helper static methods in the wrapper classes like
 * 1) valueOf() //static method
 * 2) parseXxx() //static method
 * 3) xxxValue() //member method
 */
public class WrapperClasses {
    public static void main(String[] args) {
        Integer i = Integer.valueOf("123");
        System.out.println(i);

        Float f = Float.valueOf("123.45");
        System.out.println(f);

        int pi = Integer.parseInt("123");
        System.out.println(pi);

        float pf = Float.parseFloat("123.45");
        System.out.println(pf);

        System.out.println(f.intValue());
        System.out.println(f.floatValue());
        System.out.println(f.shortValue());
        System.out.println(f.byteValue());
        System.out.println(f.doubleValue());
    }
}
