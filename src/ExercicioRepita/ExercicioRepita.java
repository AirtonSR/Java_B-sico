package ExercicioRepita;
import java.util.Scanner;
import javax.swing.*;

public class ExercicioRepita extends JFrame {
    private JPanel Main;



    public static void main(String[] args) {
        int n, s = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Informe um numero: <br><em>valor 0 interrompe </em></html>"));
            s += n;
        }while (n != 0);
        JOptionPane.showMessageDialog(null, "Resultado Final ----------->Somatorio vale " + s);
    }
}
