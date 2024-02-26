import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula09 extends JFrame{

    private JTextField textField1;
    private JButton btnSoma;
    private JLabel valor;
    private JLabel lbl1;
    private JPanel Main;
    private JTextField textField2;
    private JButton button1;
    private JPanel Main1;

    public Aula09() {
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int v = Integer.parseInt(textField1.getText());
                if(v%2 == 0){
                    lbl1.setText("Par");
                }else {
                    lbl1.setText("Impar");
                }
            }
        });
    }

    public static void main(String[] args) {
        Aula09 c = new Aula09();
        c.setContentPane(c.Main);
        c.setTitle("Par ou Impar");
        c.setSize(300,300);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setResizable(false);

        Aula09 d = new Aula09();
        d.setContentPane(d.Main1);
        d.setTitle("Par ou Impar");
        d.setSize(300,300);
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
