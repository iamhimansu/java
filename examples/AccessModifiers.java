package examples;

/**
 * AccessModifiers are of 4 types
 * <p></p>
 * 1. PUBLIC -> will be accessible to all classes in any packages
 * <p></p>
 * 2. PRIVATE -> will be accessible only to the parent, CANNOT BE ACCESSED FROM OUTSIDE THE CLASSES, ALSO packages
 * <p></p>
 * 3. PROTECTED -> will be accessible to the parent and the child classes of the same packages or child class of other packages
 * <p></p>
 * 4. DEFAULT -> will only be accessible to the class of same packages
 * <p></p>
 * By default, if no access modifiers are specified the default specifier is used by the java compiler
 */
public class AccessModifiers {
    public String name;
    protected String rollNumber;
    String school; //default
    private int age;

}
