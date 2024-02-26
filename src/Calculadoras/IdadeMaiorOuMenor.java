package Calculadoras;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IdadeMaiorOuMenor extends JFrame{
    private JPanel Main;
    private JTextField txtEspaco;
    private JButton button1;
    private JPanel Second;
    private JLabel lblNum;
    private JLabel lblSituacao;

    public IdadeMaiorOuMenor(){
        Second.setVisible(false);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(txtEspaco.getText());
                int idade = 2024 - num;
                lblNum.setText(Integer.toString(idade));
                String sit = (idade < 18) ? "Menor de idade" : "Maior de idade";
                lblSituacao.setText(sit);

                Second.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        IdadeMaiorOuMenor c = new IdadeMaiorOuMenor();
        c.setContentPane(c.Main);
        c.setTitle("Calculadora de Idade");
        c.setSize(700,500);
        c.setVisible(true);
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setResizable(false);
    }
}
