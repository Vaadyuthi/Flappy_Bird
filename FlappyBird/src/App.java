import javax.swing.*;

public class App {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Flappy Bird");

        FlappyBird flappyBird = new FlappyBird();

        frame.add(flappyBird);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        flappyBird.requestFocusInWindow();
    }
}