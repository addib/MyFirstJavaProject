package tutorials.basic;

public class Arrays {
    public static void main(String[] args) {
        int x; // declaring a variable
        int[] myArray; // declaring an array that will store ints
        // myArray = new int[4]; // initializing array to hold 4 ints
        myArray = new int[] {1,2,3,4,5,6,7,8,9,10};

        x = 5; // assigning value to variable

        /* myArray[0] = x;
        myArray[1] = 3;
        myArray[2] = 0;
        myArray[3] = 1; */

        // iterating over an array
        /* for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        } */

        // new for loop for iterating over a collection
        for (int number : myArray) {
            System.out.println(number);
        }
    }
}
