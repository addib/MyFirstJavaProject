public class Scope {
    // any method can access the variable x as it is outside of all methods; global scope
    static int x; // declaring the variable x

    public static void main(String[] args) {
        x = 5; // assigning a value to x
        System.out.println(x);

        doSomething();

        System.out.println(x);
    }

    static void doSomething() {
        x = 10; // assigning a value to x
    }

    static void doSomethingLocally() {
        // variable y is local to this method
        int y = 100; // declaring and initializing the variable y
    }

}
