import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TelaFatorial extends JFrame{
    private JLabel lbln1;
    private JLabel txtn1;
    private JPanel Main;
    private JSpinner txt;

    public TelaFatorial() {

        txt.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int n = Integer.parseInt(txt.getValue().toString());
                int f = 1;
                int c = n;
                while (c > 1){
                    f *= c;
                    c--;
                }

                txtn1.setText(Integer.toString(f));

            }
        });
    }

    public static void main(String[] args) {
        TelaFatorial telaFatorial = new TelaFatorial();
        telaFatorial.setVisible(true);
        telaFatorial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaFatorial.setSize(300,300);
        telaFatorial.setContentPane(telaFatorial.Main);
        telaFatorial.setTitle("Fatorial");

    }


}
