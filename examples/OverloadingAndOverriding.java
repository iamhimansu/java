package examples;

/**
 * Overloading is a concept of OOPS in which we change the number of parameters in the child class
 * thus on compile time the preference is given to the children method
 * <p>
 * Overriding is a concept in which we write the same function/method in the child class so that the preference id given
 * to the child class function
 * <p>
 * Key difference:
 * <p>
 * Overriding: number of <b>parameters</b> and <b>their type must be same</b>
 * <p>
 * Overloading: number of <b>parameters must be different</b>, their <b>type may be different</b>
 */
class Car {
    public void changeGear() {
        System.out.println("Simple Gear Change");
    }

    public void seats(int frontLeft, int frontRight, int backLeft, int backRight) {
        System.out.println("There are total 4 seats");
    }
}

class SportsCar extends Car {
    @Override
    public void changeGear() {
        System.out.println("Optimized gear change");
    }

    //overload
    public void seats(int frontLeft, int frontRight) {
        System.out.println("There are total 4 seats");
    }
}

public class OverloadingAndOverriding {

    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.changeGear();
        sc.seats(1, 2);
    }
}
