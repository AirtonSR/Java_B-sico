import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularAngulos extends JFrame {

    private JSlider slider2;
    private JSlider slider1;
    private JPanel Main;
    private JLabel lbln5;
    private JLabel lbln6;
    private JButton verificarButton;
    private JLabel lbln4;
    private JSlider slider3;
    private JLabel forma;
    private JLabel tipo;
    private JPanel Second;

    public CalcularAngulos() {
        Second.setVisible(false);
        verificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = lbln4.getText().length();
                int b = lbln5.getText().length();
                int c = lbln6.getText().length();
                if(a < b + c && b < a + c && c < a + b){
                    forma.setText("Forma o Triangulo");
                    if(a == b && b == c){
                        tipo.setText("Equilatero");
                    } else if (a != b && b == c) {
                        tipo.setText("Escaleno");
                    }else{
                        tipo.setText("Isosceles");
                    }
                }else{
                    forma.setText("Nao forma o Triangulo");
                }
                Second.setVisible(true);
            }
        });
        slider2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lbln5.setText(Integer.toString(slider2.getValue()));
            }
        });
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lbln4.setText(Integer.toString(slider1.getValue()));
            }
        });
        slider3.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lbln6.setText(Integer.toString(slider3.getValue()));
            }
        });
    }

    public static void main(String[] args) {
        CalcularAngulos c = new CalcularAngulos();
        c.setContentPane(c.Main);
        c.setTitle("Calcular Angulos");
        c.setSize(700,600);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setResizable(false);
    }
}
