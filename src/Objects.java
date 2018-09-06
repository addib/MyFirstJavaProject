import javax.swing.*;

public class Objects {
    public static void main(String[] args) {
        // create our window
        JFrame window = new JFrame(); // window variable that holds JFrame objects
        window.setTitle("My Window"); // calling methods on our JFrame object to configure it
        window.setSize(800, 600);
        window.setVisible(true);

        JLabel label = new JLabel();
        label.setText("My label");

        window.add(label); // add label to the window
    }
}
