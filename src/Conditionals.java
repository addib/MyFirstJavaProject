public class Conditionals {
    public static void main(String[] args) {

        // if (some expression evaluates to true)
        //      do something

        boolean sayHello = false;
        boolean sayHey = true;

        if(sayHello) {
            System.out.println("Hello");
        } else if(sayHey){
            System.out.println("Hey");
        }
        else {
            System.out.println("Goodbye");
        }
    }
}
