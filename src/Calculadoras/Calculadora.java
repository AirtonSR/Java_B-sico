package Calculadoras;


import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame{
    private JSpinner spinner1;
    private JPanel Main;
    private JButton calcularButton;
    private JPanel PanCalc;
    private JLabel txtn1;
    private JLabel txtn2;
    private JLabel txtn3;
    private JLabel txtn4;
    private JLabel txtn5;

    public Calculadora() {
        PanCalc.setVisible(false);
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num =  Integer.parseInt(spinner1.getValue().toString());
                int r = num % 2;
                txtn1.setText(Integer.toString(r));
                double c = Math.pow(num, 3);
                txtn2.setText(String.format("%.2f", c));
                double rq = Math.sqrt(num);
                txtn3.setText(String.format("%.2f", rq));
                double d = Math.cbrt(num);
                txtn4.setText(String.format("%.2f", d));
                int abs = Math.abs(num);
                txtn5.setText(Integer.toString(abs)); 
                PanCalc.setVisible(true);

            }
        });
    }


    public static void main(String[] args) {
        Calculadora c =new Calculadora();
        c.setContentPane(c.Main);
        c.setTitle("Calculadora de Idade");
        c.setSize(700,500);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setResizable(false);
    }

}


