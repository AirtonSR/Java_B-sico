import javax.swing.*;

public class Aula09_1 extends JFrame{

    private JPanel Main;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JSpinner xSpinner;
    private JButton button1;

    public static void main(String[] args) {
        Aula09_1 c = new Aula09_1();
        c.setContentPane(c.Main);
        c.setTitle("Par ou Impar");
        c.setSize(300,300);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setResizable(false);
    }
}
