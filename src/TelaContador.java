import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaContador extends JFrame {
    private JPanel Main;
    private JTextField textField1;
    private JButton calcularButton;
    private JLabel lbl;
    private JLabel lbln1;

    public TelaContador() {
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int cc = 1;
                String cont = "";
                while (cc <= 10) {
                    cont += cc + " ";
                    cc++;
                }
                lbln1.setText(cont);
            }
        });
    }

    public static void main(String[] args) {
        TelaContador t = new TelaContador();
        t.setVisible(true);
        t.setContentPane(t.Main);
        t.setSize(500,500);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setTitle("Contador");

    }
}
