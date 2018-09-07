package tutorials.basic;

public class AccessModifiers {
    public static void main(String[] args) {

        // private is the most restrictive
        // default
        // protected
        // public

    }

    // this method can be accessed anywhere in the program
    // so long as you have an instance of this class to call it from
    public void doSomethingPublic(){

    }

    // this method can't be accessed anywhere outside of this class
    private void doSomethingPrivate() {

    }

    // this method can be accessed inside of this package
    // and from subclasses of this class
    protected void doSomethingProtected() {

    }

    // this method can only be accessed inside of this package
    void doSomething() {

    }
}
