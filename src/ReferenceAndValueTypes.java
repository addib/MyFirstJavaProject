import javax.sound.midi.Soundbank;

public class ReferenceAndValueTypes {
    public static void main(String[] args) {
        // value types = byte, short, int, long, float, double, boolean, char

        int x  = 5;
        addOneTo(x); // we're passing a value type (copy of the value)

        System.out.println(x);

        Person john;
        john = new Person("John"); // creating a new person object and assigning john to refer to it
        john.setAge(20);
        celebrateBirthday(john); // passing the reference to a method; method uses the reference to manipulate the object
        System.out.println(john.getAge());
    }

    private static void celebrateBirthday(Person person) {
        person.setAge(person.getAge() + 1);
    }

    static void addOneTo(int number) {
        number = number + 1;
    }
}
