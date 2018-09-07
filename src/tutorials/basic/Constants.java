package tutorials.basic;

public class Constants {

    // constants never change values
    // usually static
    // are upper case by convention
    // are declared by using "final" as modifier
    // no harm in making "public" as they can't be altered

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    public static void main(String[] args) {

        System.out.println(WIDTH);
        System.out.println(Math.PI);
    }
}
