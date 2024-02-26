import javax.swing.*;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TelaContadorLista {
    private JSlider sliInicio;
    private JSlider sliFIm;
    private JSlider sliPasso;
    private JList list1;
    private JButton btnContar;
    private JLabel lblInicio;
    private JLabel lblFim;
    private JLabel lblPasso;

    public TelaContadorLista() {

        sliInicio.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

            }
        });
    }
}
